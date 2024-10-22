package hw5;

public class Test3 {
	public static void main(String[] args) {
		// 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])
		// 可以找出二維陣列的最大值並回傳
		
		int[][] intArray = {
							{1, 6, 3},
							{9, 5, 2}
							};
		
		double[][] doubleArray = {
				   					{1.2, 3.5, 2.2},
				   					{7.4, 2.1, 8.2}
								 };
		
//		Test3 w = new Test3();
//		System.out.println(w.maxElement(intArray));
//		System.out.println(w.maxElement(doubleArray));
		
		
		// 靜態方法應直接使用類別名稱呼叫，無需創建實例
		System.out.println(Test3.maxElement(intArray));
		System.out.println(Test3.maxElement(doubleArray));
	}
	
	public static int maxElement(int[][] x) {
		// 建立最大值變數,初始化為陣列的第一個值
		// 避免max初始值為 0 會因為陣列的最大值是負數或比 0 小的正浮點數時出現錯誤
		int max = x[0][0];
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if(x[i][j] > max) {
					// 將最大值指定給max
					max = x[i][j];
				}
			}
		}
		
		return max;
	}
	
	public static double maxElement(double[][] x) {
		// 建立最大值變數,初始化為陣列的第一個值
		// 避免max初始值為 0 會因為陣列的最大值是負數或比 0 小的正浮點數時出現錯誤
		double max = x[0][0];
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if(x[i][j] > max) {
					// 將最大值指定給max
					max = x[i][j];
				}
			}
		}
		
		return max;
		
	}
}
