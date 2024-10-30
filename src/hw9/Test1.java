package hw9;

public class Test1 implements Runnable {
	// 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的競賽過程。
	// • 每個動作都以Thread.sleep()暫停一下,以達到顯示效果。
	// Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
	// • 參考範例：CounterRunnable.java
	// • 需留意主執行緒執行順序
	
	String name;
	Thread t;
	
	public Test1(String name) {
		this.name = name;		
	}
	
	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(name + "吃第" + i + "碗飯");
			try {
				Thread.sleep((long)(Math.random() * 3000 + 500));
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "吃完了!");
	}
	
	public static void main(String[] args) {
		Test1 t1 = new Test1("饅頭人");
		Thread p1 = new Thread(t1);
		Test1 t2 = new Test1("詹姆士");
		Thread p2 = new Thread(t2);
		
		System.out.println("---------大胃王快食比賽開始！---------");
		
		p1.start();
		p2.start();
		
		try {
			p1.join();
			p2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("---------大胃王快食比賽結束！---------");
	}
}
