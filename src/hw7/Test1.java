package hw7;

import java.io.*;

public class Test1 {
	// 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 
	// (請使用append功能讓每次執行結果都能被保存起來)
	
	public static void main(String[] args) {
		
		// 檔案的名稱
		String filePath = "C:\\TIA104_Workspace\\Homework_07\\src\\hw7\\Data.txt";  // 這樣檔案會生成在指定資料夾中
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(filePath,true);  // "true" 表示開啟 append 模式
			
			// 亂數產生10個1~1000的整數
			for(int i = 1; i <= 10; i++) {
				int randomNumber =(int)(Math.random() * 1000) + 1;     // 產生 1~1000
			
				writer.write(randomNumber + "\n");
			}
			
			System.out.println("已將 10 個隨機數字寫入 Data.txt 檔案中");
				
		}catch(IOException e) {
	            System.out.println("檔案寫入失敗: " + e.getMessage());
	            
	    } finally {
	            try {
	                if (writer != null) {
	                    writer.close();  // 確保檔案被正確關閉
	                }
	            } catch (IOException e) {
	                System.out.println("檔案關閉失敗: " + e.getMessage());
	            }
	    }
	}	
}
