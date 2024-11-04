package hw10;

public class Test1 {
	// 請設計一隻程式，用亂數產生5個介於1～100之間的整數，
	// 而輸出結果可以判斷出這5個整數為是否為質數(提示：Math類別)
	
	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random()*100) + 1; // 隨機 1 ~ 100的數字放進陣列中(轉成整數)
		}
		
		for(int num : numbers) {
			if(isPrimeNumbers(num)) {
				System.out.println(num + "是質數");
			}else {
				System.out.println(num + "不是質數");
			}
		}
		
		
	}
	
	public static boolean isPrimeNumbers(int num) {
		// num 小於等於 1 不是質數
		if(num <= 1) {
			return false;
		}
		
		
		for(int i = 2; i * i <= num; i++) {
			// 如果 num 能被 i 整除，則 n 不是質數
			if(num % i == 0) {
				// 找到因數，return false
				return false;
			}
		}
		// 如果沒有找到因數，return true
		return true;
	}
}
