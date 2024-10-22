package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	
	public static void main(String[] args) {
		// 初始化 Scanner 和 Calculator 物件
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		try{
			// 接收使用者輸入x與y
			System.out.println("請輸入x的值:");
			int x = scanner.nextInt();
			System.out.println("請輸入y的值:");
			int y = scanner.nextInt();
			
			int result = calculator.powerXY(x, y);
			
			System.out.println(x + "的" + y + "次方結果為:" + result);
		
		// 捕捉自訂例外 CalException
		}catch(CalException e){
			System.out.println(e.getMessage());
		
		// 捕捉輸入非數字的情況 (InputMismatchException)
		}catch(InputMismatchException e) {
			
			// 當輸入不是數字時，顯示提示訊息
            System.out.println("輸入格式錯誤，請輸入數字！");
		
         // 捕捉非法參數例外 (IllegalArgumentException)
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

		// 捕捉其他未知例外
		}catch(Exception e) {
			System.out.println(e.getMessage());
		
		}finally {
			// 確保資源釋放
            scanner.close();
		}
		
	}
}
