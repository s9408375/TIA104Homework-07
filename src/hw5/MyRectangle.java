package hw5;

public class MyRectangle {
	// 請設計一個類別MyRectangle：
	// (1) 有兩個double型態的屬性為width, depth
	// (2) 有三個方法：
	// void setWidth(double width): 將收到的引數指定給width屬性
	// void setDepth(double depth): 將收到的引數指定給depth屬性
	// double getArea(): 能計算該長方形的面積
	// (3) 有兩個建構子：
	// public MyRectangle(): 不帶參數也無內容的建構子
	// public MyRectangle(double width, double depth): 傳入的兩個引數會指定給對應的屬性
	
	
	// (1) 有兩個double型態的屬性為width, depth
	double width;
	double depth;
	
	
	// (2) 有三個方法：
    // 設定寬度
	void setWidth(double width) {
		this.width = width;
	}
	
	// 設定深度
	void setDepth(double depth) {
		this.depth = depth;
	}
	
	// 計算長方形面積
	double getArea() {
		// 長方形面積 = 長邊 × 寬邊
//		double areaOfRectangle = this.depth * this.width;
//		return areaOfRectangle;
		
		// 直接return回傳公式不必先將其賦值給 areaOfRectangle 變數
		return this.depth * this.width;
		
	}
	
	// (3) 有兩個建構子：
    // 不帶參數的建構子
	public MyRectangle() {
		// 空的建構子
	}

	
	// 傳入兩個參數的建構子
	public MyRectangle(double width, double depth) {
//		setWidth(width);
//		setDepth(depth);
		
		// 直接設定屬性，避免多餘的 setter 呼叫
        this.width = width;  // 直接設置屬性
        this.depth = depth;  // 直接設置屬性
	}
	
	
}
