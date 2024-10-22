package hw7;

import java.io.*;

public class Test4 {
	// 承上題，請寫一個程式，能讀取Object.ser這四個物件
	// 並執行speak()方法觀察結果如何 (請利用多型簡化本題的程式設計)
	
	public static void main(String[] args) {
		// 定義要讀取的檔案路徑
		String filePath = "C:\\data\\Object.ser";
	        
		// 使用 ObjectInputStream 來讀取物件
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
			
			// 讀取物件並執行 speak 方法
			Object obj;
			
			while (true) {
				try {
					// 持續讀取物件直到沒有更多物件可讀
					obj = ois.readObject();
	                    
					// 使用多型呼叫 speak 方法
					if (obj instanceof Speakable) {
						((Speakable) obj).speak(); // 調用 speak 方法
					}
				} catch (EOFException e) {
					// 當到達檔案結尾時停止讀取
					break;
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace(); // 輸出錯誤信息
		}
	}
}



	// 定義 Speakable 介面
	interface Speakable {
	    void speak();
	}

