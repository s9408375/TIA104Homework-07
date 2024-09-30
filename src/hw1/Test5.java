package hw1;

public class Test5 {
	public static void main(String[] args) {
		// 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢?
		// 複利公式 -> 本金 + 利息 = 存入金額 * ( 1 + 利率 ) 的 n次方
		int money = 1_500_000;
		double rate = 2.0 / 100.0;
		double saving = money * ( 1 + rate );
		
		for( int year = 1; year <=10; year++){
			saving *= ( 1 + rate );
		}
		
		System.out.println("某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢?");
		System.out.println("複利10年後本金加利息總共=" + (int)saving + "元");
	}
}
