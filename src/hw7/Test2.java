package hw7;

import java.io.*;

public class Test2 {
	// 請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。
	// 呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案
	
	public static void main(String[] args) {
		copyFile("C:\\TIA104_Workspace\\Homework_07\\src\\hw7\\Data.txt","C:\\TIA104_Workspace\\Homework_07\\src\\hw7\\DataCopy.txt");
	}
	
	static void copyFile(String sourcePath,String destinationPath){
		
		FileInputStream inputStream = null;  // 用來讀取檔案的輸入串流
        FileOutputStream outputStream = null; // 用來寫入檔案的輸出串流
		
		try {
			// 使用來源檔案的路徑創建輸入資料流
            inputStream = new FileInputStream(sourcePath);
            
            // 使用目的地檔案的路徑創建輸出資料流
            outputStream = new FileOutputStream(destinationPath);
            
            // 設定一個緩衝區，用來提高讀寫效率
            byte[] buffer = new byte[1024]; // 緩衝區大小為 1024 bytes
            int length; // 用來記錄實際讀取的字元數
            
            // 讀取來源檔案直到結束
            while ((length = inputStream.read(buffer)) > 0) {
                // 將讀取到的內容寫入目標檔案
                outputStream.write(buffer, 0, length);
            }
            
            System.out.println("檔案複製已成功!");
			
		}catch(IOException e) {
            // 當發生 IOException 時，顯示錯誤訊息
            System.out.println("檔案複製失敗: " + e.getMessage());
            
        }finally {
            // 關閉串流，避免資源洩漏
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                // 捕捉關閉串流時的異常
                System.err.println("關閉串流時發生錯誤: " + e.getMessage());
            }
        }
	}
}