package hw1;

public class Test4 {
	public static void main(String[] args) {
		// 一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		int r = 5;
		double circleArea = r * r * PI;     // 圓面積 = 半徑x半徑x3.14
		double circumference = r * 2 * PI;  // 圓周長 = 半徑 * 2 * 圓周率
		
		System.out.println("一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長?");
		System.out.println("圓面積=" + circleArea);
		System.out.println("圓周長=" + circumference);
	}
}
