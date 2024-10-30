package hw9;

public class Test2 {
	// 熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領錢亂花,
	// 不好好唸書,所以只要看到熊大帳戶的餘額超過3000元,
	// 就會停止匯款給熊大;但要是帳戶餘額在2000元以下,
	// 熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊大要提款的金額,
	// 熊大就會暫停提款,直到媽媽告知他錢已經入帳戶。
	// 假設媽媽一次匯款2000元,熊大一次提款1000元,
	// 寫一個Java程式模擬匯款10次與提款10次的情形。
	// 參考範例：TestWaitNotify.java
	
	public Test2(String name) {
	}
	
	public static void main(String[] args) {
		Account account = new Account(); // 建立帳戶物件
        Mother mother = new Mother(account); // 建立媽媽執行緒
        Bear bear = new Bear(account); // 建立熊大執行緒
        
        mother.start(); // 啟動媽媽執行緒
        bear.start(); // 啟動熊大執行緒
	}
	
}

class Account {
	
	private int balance = 0;  // 帳戶餘額，初始為0
	
	// 提款方法，當帳戶餘額不足時會等待匯款
	synchronized public void getMoney(int amount) {
		// 如果餘額不足以提款，熊大需要等待
		while(balance < amount) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			System.out.println("媽媽被熊大要求匯款！");
			try {
				wait();  // 等待匯款
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			// 當媽媽匯款後，熊大被喚醒並收到通知
            System.out.println("熊大被老媽告知帳戶已經有錢！");
		}
		
		// 餘額足夠，執行提款操作
		balance -= amount;
		System.out.println("熊大領了" + amount + "帳戶共有:" + balance + "元");
		
		// 如果餘額在2000以下，通知媽媽匯款
		if(balance < 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify(); // 喚醒媽媽線程進行匯款
		}
	}
	
	// 匯款方法，當餘額超過3000時會停止匯款
	synchronized public void addMoney(int amount) {
		// 餘額大於3000,媽媽不會繼續匯款
		while (balance > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			
			try {
				wait();    // 等待熊大提款
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 餘額不足，執行匯款操作
		balance += amount;
		System.out.println("媽媽存了" + amount + "，帳戶共有:" + balance);
		
		// 如果餘額足夠熊大提款，通知熊大可以提款
		if(balance > 1000) {
			notify(); // 喚醒熊大線程進行提款
		}
	}
}

// 熊大執行緒，模擬提款動作
class Bear extends Thread{
	Account account;
	public static boolean finished = false;
	
	public Bear(Account account) {
		this.account = account;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			// 每次提款 1000 元
			account.getMoney(1000);
			try {
				// 模擬提款過程中的時間間隔
				Thread.sleep(1000); 
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 設置 finished 為 true，告訴媽媽匯款結束
        Bear.finished = true;
        synchronized(account) { // 確保媽媽得知提款完成
            account.notify(); 
        }
	}
}

// 媽媽執行緒，模擬匯款動作
class Mother extends Thread{
	Account account;
	
	public Mother(Account account) {
		this.account = account;
	}	
	
	public void run() {
		while (!Bear.finished) { // 使用 Bear.finished 檢查是否應該停止
            // 每次匯款 2000 元
            account.addMoney(2000);
            try {
                // 模擬匯款過程中的時間間隔
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("熊大被老媽告知帳戶已經有錢！");
	}
}