package hw4;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
	// 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
	// 例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
	// (提示1：Scanner，陣列)
	// (提示2：需將閏年條件加入)
	// (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
		
	//建立三個讓使用者可輸入年月份
	Scanner sc = new Scanner(System.in);
	System.out.println("請輸入三個整數，分別代表西元yyyy年，mm月，dd日");
	
	System.out.println("請輸入年份:");
	int year = sc.nextInt();
	System.out.println("請輸入月份:");
	int month = sc.nextInt();
	
	// 驗證輸入月份是否正確
	while(month < 1 || month > 12) {
		System.out.println("輸入月份不正確，請輸入正確月份(1~12月):");
		month = sc.nextInt();
	}
	
	// 每個月的天數,因為索引值從0開始故輸入索引值0為0,讓month可以對應1~12月份
	int[] dayInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	// 是否為閏年，其條件為：1.可被4整除且不為100整除者為閏年  2.可被400整除為閏年
	boolean isLeapYear = (year % 4 ==0 && year % 100 != 0) || (year % 400 == 0);
	if(isLeapYear) {
		dayInMonth[2] = 29; // 閏年的2月有29天
	}
	
	System.out.println("請輸入日期:");
	int day = sc.nextInt();
	
	// 驗證輸入日期是否正確
	while (day < 1 || day > dayInMonth[month]) {
        System.out.println("輸入日期不正確，請輸入正確日期(1~" + dayInMonth[month] + "):");
        day = sc.nextInt(); // 重新輸入日期
    }

	// 計算該年是第幾天
	int dayOfYear = 0;
	for(int i = 1; i < month; i++) {
		// 累加之前月份的天數,dayOfYear = dayOfYear + dayInMonth[i];
		// 但不包含使用者輸入的 month 月份
		dayOfYear += dayInMonth[i];  
	}
	
	// 加上使用者輸入當月的指定日期天數
	dayOfYear += day;
	
	System.out.println("輸入的日期為該年第" + dayOfYear + "天");
	
	sc.close();
	}
}
