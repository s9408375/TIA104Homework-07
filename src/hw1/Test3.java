package hw1;

public class Test3 {
	public static void main(String[] args) {
		// 計算256559秒為多少天、多少小時、多少分與多少秒
		int total = 256559;
        int inADay = 24 * 60 * 60;  // 一天的秒數
		int inAHour = 60 * 60;      // 一小時的秒數
		int inAMinute = 60;         // 一分鐘的秒數
		
		int day = total / inADay;    // 總秒數除以一天的秒數得到幾天
		int hour = (total % inADay) / inAHour;  // 總秒數除以一天的秒數餘額再除以一小時的秒數得到幾小時
		int minute = ((total % inADay)% inAHour) / inAMinute;  // 總秒數除以一天的秒數餘額再除以一小時的秒數的餘額再除以一分鐘的秒數得到幾分鐘
		int seconds = ((total % inADay)% inAHour) % inAMinute; // 總秒數除以一天的秒數餘額再除以一小時的秒數的餘額再除以一分鐘的秒數的餘額得到幾秒鐘
		System.out.println("計算256559秒為多少天、多少小時、多少分與多少秒?");
		System.out.println("總共為" + day + "天" + hour + "小時" + minute + "分" + seconds + "秒");
	}

}
