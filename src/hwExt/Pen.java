package hwExt;

public abstract class Pen {
	// 建立父類別Pen
	// (1) 兩個屬性：品牌(brand)、價格(price) (封裝設計) 
	// (2) 建構子設計：一個無參數與一個根據屬性而設計
	// (3) 定義Getter/Setter方法
	// (4) 宣告一個抽象方法write()

	private String brand;
	private double price;
	
	// 不帶參數的建構子
	public Pen() {
		// 空的建構子
	}
	
	// 根據屬性而設計的建構子
	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	// Setter 方法，設定 brand 的值
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// Getter 方法，取得 brand 的值
	public String getBrand() {
		return this.brand;
	}
	
	// Setter 方法，設定 price 的值
	public void setPrice(double price) {
		this.price = price;
	}
	
	// Getter 方法，取得 price 的值
	public double getPrice() {
		return this.price;
	}
	
	// 宣告一個抽象方法write()
	public abstract void write();   // 抽象方法不需要實作
	
}
