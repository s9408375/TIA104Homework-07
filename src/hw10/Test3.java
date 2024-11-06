package hw10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test3 {
	// 請設計一隻程式，讓使用者輸入日期(年月日，例如:20110131)後，
	// 可以轉成想要的輸出格式化成(1)年/月/日(2)月/日/年(3)日/月/年三選一
	// 而輸入非指定日期數字格式會顯示出提示訊息如圖
	// (提示：TestFormatter.java, Java API文件，判斷格式可用正規表示法)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("請輸入日期(年月日，例如:20110131):");
			String ymd = sc.nextLine();

			if (isDay(ymd)) {
				String year = ymd.substring(0, 4);
				String month = ymd.substring(4, 6);
				String day = ymd.substring(6);

				while (true) {
					System.out.println("欲格式化成(1)年/月/日 (2)月/日/年 (3)日/月/年:");
					int in = sc.nextInt();

					// 在使用 nextInt() 後，加上這行來清除換行
					sc.nextLine();
					if (in >= 1 && in <= 3) {
						switch (in) {
						case 1:
							System.out.println("年/月/日:" + " " + year + "/" + month + "/" + day);
							break;
						case 2:
							System.out.println("月/日/年:" + " " + month + "/" + day + "/" + year);
							break;
						case 3:
							System.out.println("日/月/年:" + " " + day + "/" + month + "/" + year);
							break;
						}
						
						break;   // 正確選擇後跳出格式選擇迴圈
						
					}else {
						System.out.println("輸入錯誤！請重新選擇 1 ~ 3");
					}
				}

				break;    // 正確選擇後跳出輸入日期迴圈

			} else {
				System.out.println("日期格式不正確，請再輸入一次！");
			}
		}
	}

	public static boolean isDay(String date) {

		// 正規表示法檢查是否為8個數字
		String reg = "\\d{8}";

		// 驗證字串是否完全符合指定的正規表示法
		if (!Pattern.matches(reg, date)) {
			return false;
		}

		// 指定了一個日期格式模式為 yyyMMdd
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("yyyyMMdd");
		try {
			LocalDate day = LocalDate.parse(date, fm);
			return true; // 格式且日期有效 return true
		} catch (DateTimeParseException e) {
			return false; // 格式且日期有誤 return false (例如:20241332)
		}

	}

}
