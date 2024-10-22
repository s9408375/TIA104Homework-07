package hw3;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		// 使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
		// 建立讓使用者輸入三個數字的提示
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數");
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		int data3 = sc.nextInt();
		// 列出三角形的條件兩邊和必定大於第三邊及三邊皆大於0才是三角形
		if(data1 > 0 && data2 > 0 && data3 > 0 && (data1 + data2 > data3) && (data3 + data2 > data1) && (data1 + data3 > data2)){
			// 正三角形:為三個邊均等長
			if(data1 == data2 && data2 == data3) {
				System.out.println("正三角形");
			// 等腰三角形:為二邊相等
			}else if(data1 == data2 || data2 == data3 || data1 == data3) {
				System.out.println("等腰三角形");
			// 直角三角形:為一邊長的平方等於另兩邊長的平方和
			}else if(data1 * data1 + data2 * data2 == data3 * data3 || data3 * data3 + data2 * data2 == data1 * data1 || data3 * data3 + data1 * data1 == data2 * data2) {
				System.out.println("直角三角形");
			}
			else{
				System.out.println("其他三角形");
			}
		}else {
			System.out.println("不是三角形");
		}
		sc.close();
	}
}
