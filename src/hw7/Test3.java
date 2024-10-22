package hw7;

import java.io.*;

public class Test3 {
	// 請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件
	// 寫到C:\data\Object.ser裡。注意物件寫入需注意的事項
	// 若C:\內沒有data資料夾，請用程式新增這個資料夾
	
	public static void main(String[] args) {
		// 創建 Dog 與 Cat 物件
		Dog myDog = new Dog("Puppy"); // 使用名稱參數
		Cat myCat = new Cat("Kitty"); // 使用名稱參數
		
		// 定義要寫入的資料夾路徑
        String folderPath = "C:\\data";
        String filePath = folderPath + "\\Object.ser";
        
    	// 檢查資料夾是否存在，若不存在則創建
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdir(); // 創建資料夾
        }
        
        // 用於寫入檔案的資料流
        FileOutputStream fos = null;   // 用於寫入原始資料
        ObjectOutputStream oos = null; // 用於寫入物件
        
        try {
        	
        	// 初始化FileOutputStream，準備寫入檔案
            fos = new FileOutputStream(filePath);
            
            // 初始化ObjectOutputStream，將FileOutputStream傳入
            oos = new ObjectOutputStream(fos);
            
            // 將Dog物件寫入檔案
            oos.writeObject(myDog); // 寫入Dog物件
            
            // 將Cat物件寫入檔案
            oos.writeObject(myCat); // 寫入Cat物件
            
            // 輸出成功訊息
            System.out.println("物件成功寫入到 " + filePath);
            
        } catch (IOException e) {
        	
            e.printStackTrace(); // 如果有錯誤，輸出錯誤信息
            
        } finally {
        	
            // 確保關閉流，釋放資源
            try {
                if (oos != null) {
                    oos.close(); // 關閉ObjectOutputStream
                }
                if (fos != null) {
                    fos.close(); // 關閉FileOutputStream
                }
            } catch (IOException e) {
                e.printStackTrace(); // 如果關閉流時有錯誤，輸出錯誤信息
            }
        }
	}
}
