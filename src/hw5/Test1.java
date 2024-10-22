package hw5;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		// 請設計一個方法為starSquare(int width, int height)
		// 當使用者鍵盤輸入寬與高時，即會印出對應的*長方形
		
		// 建立讓使用者輸入寬與高
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高:");
		int width = sc.nextInt();
		int height = sc.nextInt();
		
		// 呼叫 starSquare 方法來印出星號長方形
		starSquare(width, height);
		
		sc.close();
	}
	
	// 方法: 印出寬與高 的星號長方形
	public static void starSquare(int width, int height) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();   // 每印完一行星號後換行
		}
	
	}
}
