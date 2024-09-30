package hw2;

public class Test2 {
	public static void main(String[] args) {
		// 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。
		// 輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int count = 0;
		System.out.println("排除個位數與十位數有4的數字後,阿文可以選擇的數字有這些:");
		
		for(int num = 1; num <= 49; num++) {
			if( num % 10 == 4 ){          // 排除num除以10的餘數為4時, 相當於排除 4 14 24 34 44
				
			}else if( num / 10 == 4) {    // 排除num除以10為4時, 相當於排除 40 41 42 43 44 45 46 47 48 49
				
			}else {
				System.out.print(num);
				System.out.print(" ");
				count++;                  // 跑一次迴圈+1去算,排除4以後的總共有幾個數字
			}
		}
		System.out.println();
		System.out.println("===================================================================================================");
		System.out.println("總共有" + count + "個數字可選擇");
	}
}
