package hw2;

public class Test1 {
	public static void main(String[] args) {
		
		// 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int sum = 0;
		for(int num = 1; num <= 1000 ; num++) {
			if(num % 2 == 0) {
				sum += num;
			}
		}
		
		System.out.println("1~1000的偶數和為 = " + sum);
		
		System.out.println("================================================");
			
		// 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		sum = 1;
		for(int num = 1; num <= 10 ; num++) {
			sum *= num;
		}
		
		System.out.println("使用for迴圈做出的1~10的連乘積為 = " + sum);
		
		System.out.println("================================================");
		
		// 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		sum = 1;
		int num = 1;
		while(num <= 10) {
			sum *= num;
			num++;
		}
		
		System.out.println("使用while迴圈做出的1~10的連乘積為 = " + sum);
		
		System.out.println("================================================");
		
		// 請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100
		// 1 4 9 16 25 36 49 64 81 100分別為 1 2 3 4 5 6 7 8 9 10 個別平方後得到的值
		System.out.println("以下為1 2 3 4 5 6 7 8 9 10 個別平方後得到的值:");
		for(num = 1; num <= 10 ; num++) {
			System.out.print(num * num + " ");
		}
		
	}

}
