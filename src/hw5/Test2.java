package hw5;

public class Test2 {
	public static void main(String[] args) {
		// 請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值
		// 並印出這10個亂數與平均值
		
		// 呼叫randAvg方法
		randAvg();
	}
	
	public static void randAvg() {
		
		System.out.println("本次亂數結果:");
	
		int sum = 0;
		for(int i = 0;i <= 9; i++) {
			int randomNumber =(int)(Math.random() * 100) + 1;     // 產生 0~100 的亂數
			// 將10個亂數加總總額指定給sum
			sum += randomNumber;
			
			System.out.print(randomNumber + " ");
		}
		
		System.out.println();
		
		// 計算10.0個亂數的平均值
		double avg = sum/10.0;
		
		System.out.println("以上10個亂數的平均值為:" + avg);
	}
	
}
