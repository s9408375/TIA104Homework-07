package hw4;

public class Test1 {
	public static void main(String[] args) {
	// 有個一維陣列如下：{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
	// 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		
	int[] number = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
	
	// 先計算總和
	int sum = 0;
	for(int i = 0; i < number.length; i++) {
		sum += number[i];
	}
	
	// 再計算平均
	double average = sum/number.length;
	
	// 印出平均值
	System.out.println("所有元素的平均值:" + average );
	
	System.out.println("==================================");
	System.out.print("大於平均值的元素為:");
	
	for(int j = 0; j < number.length; j++) {
		if(number[j] > average) {
			System.out.print(number[j] + " ");
		}
	}
	System.out.println();
	System.out.println("==================================");
	
	// 請建立一個字串，經過程式執行後，輸入結果是反過來的
	// 例如String s = “Hello World”，執行結果即為dlroW olleH
	
	// 建立字串
	String s = "Hello World";
	
	// 建立與字串長度相同的字元陣列
	char[] charArray = new char[s.length()];
	
	// 透過 chatAt() 逐個讀寫字元並反向存入陣列
	for(int i = 0; i < s.length(); i++) {
		
		// 使用charAt(int index)方法取出索引值的字元
		// s.length() - 1 這是字串的最後一個字元的索引(因為索引是從 0 開始的)
		// - i 這個部分會隨著迴圈的進行，從最後一個字元逐步往前取字元
		
		charArray[i] = s.charAt(s.length() - 1 - i);
	}
	
	// 將反轉後的字元陣列轉換回字串
    String reversed = new String(charArray);

    
	System.out.println("Hello World 倒轉過來: " + reversed);
	
	System.out.println("==================================");
	
	
	// 有個字串陣列如下 (八大行星)：
	// {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
	// 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
	
	// 建立八大行星陣列
	String[] star = {"mercury","venus","earth","mars","jupiter","saturn","uranus","neptune"};
	
	int count = 0;
	for(int i = 0; i < star.length; i++) {
		for(int j = 0; j < star[i].length(); j++) {
			// 建立字元變數 starArray 存取 star某個索引值中的字元某個索引值
			char starArray = star[i].charAt(j);
			// 比較每個字串中的每個字元是否符合母音(a, e, i, o, u),符合count就+1 
			if( starArray == 'a' || starArray == 'e' || starArray == 'i' || starArray == 'o' || starArray == 'u') {
				count ++;
			}
		}
	}
	
	System.out.println("八大行星總共有" + count + "個母音");
		
	}
}
