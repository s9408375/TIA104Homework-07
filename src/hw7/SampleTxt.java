package hw7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SampleTxt {
	// 請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
	// Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
	
	static void p(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		// 檔案的路徑
        String filePath = "C:\\TIA104_Workspace\\Homework_07\\src\\hw7\\Sample.txt";
        
		// 讀取檔案並計算相關數據
		try {
			// 1. 讀取檔案大小（位元組數）
			File f1 = new File(filePath);
			long fileSizeInBytes = f1.length(); // 使用 f1.length() 取得檔案的位元組數
			
			// 讀取檔案的所有行
			 List<String> lines = Files.readAllLines(Paths.get(filePath));
			
			// 計算字元數和行數
			int charcount = 0;  // 用來計算總字元數
			int linecount = lines.size();  // 用來計算總列數
			
			// 使用 for-each 計算每一行的字元數
			// lines 是前面讀取檔案後得到的 每一行字串的列表，每次迴圈會抓取一行字串，存放在 line 這個變數中
			for(String line : lines) {
				charcount += line.length();  // 每一行的長度加到字元數中
			}
			
			// 輸出結果
			System.out.println("Sample.txt檔案共有" + fileSizeInBytes +"個位元組"+ charcount +"個字元" + linecount +"列資料");
					
		}catch(IOException e){
			System.out.println("檔案讀取失敗: " + e.getMessage());
		}
	}
}
