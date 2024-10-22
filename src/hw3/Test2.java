package hw3;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		// 亂數產生一個0～100的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息
		// 每次猜就會提示你是大於還是小於正確答案
		
		int i;
		i =(int)(Math.random() * 100) + 1;     // 產生 0~100 的亂數
		
		// 建立開始猜數字的問題
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!(範圍是0~100)");
		
		// 建立while迴圈讓使用者持續輸入猜數字，直到猜對為止
		while(true) {
			// 建立使用者輸入一個數字
			int data = sc.nextInt();
			
			// 跟 0~100 的亂數比大小獲得提示
			if(data < i) {
				System.out.println("猜錯囉，數字太小，要再大一點！");
			}else if(data > i){
				System.out.println("猜錯囉，數字太大，要再小一點！");
			}else {
				System.out.println("恭喜你，猜對了！答案就是" + i);
				break;  // 猜對後跳出迴圈
			}
		}
		sc.close();
	}
}
