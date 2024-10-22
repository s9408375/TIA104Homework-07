package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
	// 請建立一個Collection物件並將以下資料加入：
	// Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
	// Object物件、“Snoopy”、BigInteger(“1000”)
	
	public static void main(String[] args) {
		// 使用泛型來提高類型安全性，使用 List<Object>
		List<Object> list = new ArrayList();
		
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(Short.valueOf("100")); // 使用 Short.valueOf 來處理 String 轉換
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		// 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		System.out.println("使用 Iterator :");
		Iterator<Object> objs = list.iterator();
		while(objs.hasNext()) {
			System.out.print(objs.next() + "  ");
		}
		System.out.println();
		
		System.out.println("===============================");
		System.out.println("使用傳統的 for 迴圈:");
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.print(obj + "  ");
		}
		System.out.println();
		
		System.out.println("===============================");
		System.out.println("使用增強功能的 for 迴圈(Using Enhanced foreach):");
		for (Object lis : list) {
			System.out.print(lis + "  ");
		}
		System.out.println();
		
		// 移除不是java.lang.Number相關的物件
		System.out.println("===============================");
		System.out.println("移除非 Number 相關的物件...");
		Iterator<Object> iterator = list.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			if(!(obj instanceof Number)) {
				iterator.remove();
			}
		}
		System.out.println();
		
		System.out.println("===============================");
		System.out.println("再次印出非Number這個集合物件的所有元素:");
		// 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
		for(Object lis : list) {
			System.out.print(lis + "  ");
		}

	}
	
	
	
}
