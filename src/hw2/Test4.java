package hw2;

public class Test4 {
	public static void main(String[] args) {
	  // 請設計一隻JAVA程式，輸出結果如下：
	  // A
      // BB
	  // CCC
	  // DDDD
	  // EEEEE
	  // FFFFFF
		
      /*
      * System.out.println((int)('A'));   // 取得'A'轉換數字為65
      * System.out.println((int)('B'));   // 取得'B'轉換數字為66
      * System.out.println((int)('C'));   // 取得'C'轉換數字為67
      * System.out.println((int)('D'));   // 取得'D'轉換數字為68
      * System.out.println((int)('E'));   // 取得'E'轉換數字為69
      * System.out.println((int)('F'));   // 取得'F'轉換數字為70
      */
		
	  // 因此字元轉換成數字要印出下方數字(記得轉回"字元")：
	  // 65
	  // 66 66
	  // 67 67 67
	  // 68 68 68 68
	  // 69 69 69 69 69
	  // 70 70 70 70 70 70
		
		for(int num1 = 0; num1 <= 5; num1++){          // 外層大迴圈num1從0開始需要六排,所以num1必須0~5等於6排
			for(int num2 = 0; num2 <= num1; num2++) {  // 內層小迴圈num2必須小於外層大迴圈num1才能控制在最多6排以內,並進行num2遞增
				int num3 = 65 + num1;                  // 65加上外層大迴圈num1的遞增指定給num3
				System.out.print((char)num3);          //用char將數字編碼轉換為字元
			}
			System.out.println();
		}
    }
}