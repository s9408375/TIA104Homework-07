package hw10;

import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
	// 請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示
	// (1)千分位(2)百分比(3)科學記號
	// 而輸入非任意數會顯示提示訊息如圖
	// (提示： TestFormatter.java, Java API文件, 判斷數字可用正規表示法)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Formatter fm = new Formatter();  // 創建 Formatter 物件以格式化輸出
		double number = 0; // 儲存轉換後的數字
		
		while(true) {
			System.out.println("請輸入一個數字:");
			String in = sc.nextLine();  // 讀取使用者輸入的整行字串
				
			// 可以是負數或正數(因為 -? 可選的負號)
			// 整數部分必須存在且至少有一位數字 ( \\d+ )
			// 小數部分是可選的，如果存在，則必須以小數點開頭，後面必須至少有一位數字 (\\.\\d+)?
			if(in.matches("-?\\d+(\\.\\d+)?")) {
				// 如果格式正確，將字串轉換為 double 型別的數字
	            number = Double.parseDouble(in);
				break;  // 跳出循環，進入格式選擇
			}else {
				System.out.println("數字格式不正確，請再輸入一次！");
			}
		}	
			
		// 顯示選項給使用者並要求輸入有效的選擇
		int choice = 0;  // 儲存使用者選擇
		
		while(true) {
			System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號");
	        choice = sc.nextInt();
	        
	        if(choice >= 1 && choice <= 3) {
	        	break;  // 有效選擇，跳出循環
	        }else {
	        	// 選擇無效，提示使用者重新輸入
                System.out.println("選項無效，請輸入 1 到 3 之間的數字");
	        }
		}
		
        
        // 根據使用者的選擇格式化輸出
        switch(choice) {
        	case 1:
        		// 千分位
                System.out.println("千分位格式：" + fm.format("%,.2f", number)); // 使用千分位顯示，保留兩位小數
                break;
        	case 2:
        		// 百分比
                System.out.println("百分比格式：" + fm.format("%.2f%%", number * 100)); // 將數字乘以 100 並以百分比形式顯示
                break;
        	case 3:
        		// 科學記號
                System.out.println("科學記號格式：" + fm.format("%e", number)); // 以科學記號形式顯示
                break;
        	default:
                // 處理無效的選項
                System.out.println("選項無效，請輸入 1 到 3 之間的數字。");
        }
        
        sc.close();
	}
}
