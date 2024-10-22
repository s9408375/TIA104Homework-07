package hw5;

public class Test5 {
	public static void main(String[] args) {
		// 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法genAuthCode()
		// 當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫與數字的亂數組合
		
		// 呼叫 genAuthCode 方法
		genAuthCode();
		
	}
	
	
	public static void genAuthCode() {
		System.out.println("本次隨機產生的驗證碼為:");
		
		// 建立一個隨機驗證碼的陣列長度為8
		char[] randomCode = new char[8];
		
		for(int i = 0; i < randomCode.length; i++) {
		    // 隨機選擇數字、大寫字母、小寫字母
			int randomChoice = (int)(Math.random() * 3);
			
			// 當 randomChoice == 0時,隨機產生數字字元數字轉換成字元
			// 生成一個 0 ~ 9 之間的亂數,再加上48後,就可以得到 48 ~ 57 範圍的亂數
			if(randomChoice == 0) {
				randomCode[i] = (char)((int)(Math.random() * 10) + 48);  // 產生數字 0 ~ 9 在Unicode的範圍是 48 ~ 57 的亂數
				
			// 當 randomChoice == 1時,隨機產生英文大寫字元數字轉換成字元
			// 生成一個 0 ~ 25 之間的亂數,再加上65後,就可以得到 65 ~ 90 範圍的亂數
			}else if(randomChoice == 1) {
				randomCode[i] = (char)((int)(Math.random() * 26) + 65);  // 產生英文字母大寫Unicode的範圍是 65 ~ 90 的亂數
				
			// 當 randomChoice == 2時,隨機產生英文小寫字元數字轉換成字元	
			// 生成一個 0 ~ 25 之間的亂數,再加上97後,就可以得到 97 ~ 122 範圍的亂數
			}else {
				randomCode[i] = (char)((int)(Math.random() * 26) + 97);  // 產生英文字母小寫Unicode的範圍是 97 ~ 122 的亂數
			}
		}
		
		System.out.println(randomCode);
		
	}
}
