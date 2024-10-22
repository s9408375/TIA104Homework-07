package hw3;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		// 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討厭哪個數字
        // 設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇的號碼與總數
		
		// 建立讓使用者填數字
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字？(請輸入1~9)");
		int data = sc.nextInt();
		
		// 限制阿文只能輸入1~9，若輸入錯誤數字則會出現錯誤提示需要再次輸入數字
		while(true){
			if(data >= 1 && data <= 9) {
				break;
			}else{
				System.out.println("請重新輸入討厭的數字，只能輸入1~9");
				data = sc.nextInt();
			}
		}
		
		int count = 0;
		for(int i = 1; i <= 49; i++) {
			if(i / 10 == data || i % 10 == data) {
				continue;
			}
			// 印出 1~49 排除阿文討厭的數字並計算幾個數字
			System.out.print( i + "\t");
			count++;
			
			// 每 6 個數字換行
			if(count % 6 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("總共有" + count + "個數字可挑選");
		
		System.out.println("=====================================");
		sc.close();
	}
}

