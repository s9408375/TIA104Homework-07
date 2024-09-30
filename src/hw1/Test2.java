package hw1;

public class Test2 {
	public static void main(String[] args) {
		//計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int i = 200,j = 12;
		System.out.println("計算200顆蛋總共是幾打幾顆?(一打為12顆)");
		System.out.println("200顆蛋總共="+ i / j +"打");
		System.out.println("無法成一打的蛋總餘數="+ i % j +"顆");
	}
}
