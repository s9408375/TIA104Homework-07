package hwExt;

public class TestPen {
	public static void main(String[]args) {
		Pen p1 = new Pencil("鉛筆品牌",10.0);        // 定價為10
		Pen p2 = new InkBrush("墨水筆品牌",100.0);   // 定價為100
		
		
		// 多型操作
		System.out.print("鉛筆的功能為:");
		p1.write();
		
		System.out.println("鉛筆的品牌為:" + p1.getBrand());
		System.out.println("鉛筆的價格為:" + p1.getPrice());
		
		System.out.println("============================");
		
		System.out.print("墨水筆的功能為:");
		p2.write();
		
		System.out.println("墨水筆的品牌為:" + p2.getBrand());
		System.out.println("墨水筆的價格為:" + p2.getPrice());
	}
}
