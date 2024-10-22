package hw4;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
	// 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下：
	// 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他
	// 並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」
	
	// 建立讓使用者輸入要借的金額
	Scanner sc = new Scanner(System.in);
	System.out.println("要借的金額:");
	int borrowMoney = sc.nextInt();
	
	int[][] colleague = {
							{25, 32, 8, 19, 27},
							{2500, 800, 500, 1000, 1200}
						};
	
	System.out.println("有錢可借的員工號碼為:");
	
	int count = 0;
	for(int i = 0; i < colleague[0].length; i++) {
		// 直接判斷現金是否足夠
		if(borrowMoney <= colleague[1][i]) {
			// 直接印出可借錢同事的號碼
			System.out.print(colleague[0][i] + " ");
			count++;
		}
	}
	
	System.out.println();
	System.out.println("總共有" + count + "個同事可借錢");
	
	sc.close();
	}

}
