package hw2;

public class Test3 {
	public static void main(String[] args) {
		// 請設計一隻JAVA程式，輸出結果如下：
		// 1 2 3 4 5 6 7 8 9 10 
		// 1 2 3 4 5 6 7 8 9 
		// 1 2 3 4 5 6 7 8 
		// 1 2 3 4 5 6 7 
		// 1 2 3 4 5 6 
		// 1 2 3 4 5 
		// 1 2 3 4 
		// 1 2 3 
		// 1 2 
		// 1
		
		int i, j;
		for(j = 10; j >= 1; j--) {      // step2.外層大迴圈j必須大於1,j必須要遞減
			for(i = 1; i <= j; i++) {   // step1.先印出裡面內層小迴圈第一排的1~10,內層小迴圈i必須小於外層大迴圈j
				System.out.print(i);
	            System.out.print(" ");
	        }
		System.out.println();
		}
	}
}

