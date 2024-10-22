package hw6;

public class Calculator {
	// 請設計三個類別Calculator.java，CalException.java與CalTest.java
	// 在Calculator.java裡有個自訂方法為powerXY(int x, int y)
	// 功能是會計算x的y次方並回傳結果。 CalTest.java執行後，使用者可以輸入x與y的值，
	// 請加入例外處理機制，讓程式能解決以下狀況：
	// 1. x與y同時為0，(產生自訂的CalException例外物件)
	// 2. y為負值，而導致x的y次方結果不為整數
	// 3. x與y皆正確情況下，會顯示運算後結果
	
	// 計算 x 的 y 次方
	public int powerXY(int x, int y)throws CalException {
        
		// 如果 x 與 y 都是 0　，拋出自訂例外	
		if(x == 0 && y == 0) {
			 throw new CalException("0的0次方沒有意義！");
		}
		
		// 如果 y 是負數且結果為非整數，拋出
		if(y < 0) {
			throw new IllegalArgumentException("次方為負值，結果回傳不為整數！");
		}
		
        return (int)(Math.pow(x, y));
	}

}
