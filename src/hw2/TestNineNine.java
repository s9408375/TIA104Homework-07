package hw2;

public class TestNineNine {
    public static void main(String[] args) {
    	System.out.println("以下為用for + while迴圈製作九九乘法表");
    	// 用for + while迴圈製作九九乘法表
		int i, j;
    	for( i = 1; i <= 9; i++ ) {
    		j = 1;
    		while( j <= 9 ) {
    			System.out.print(i + "*" + j +"=" + i * j + "\t");
    			j++;
    		}
    		System.out.println();
    	}
    	
		System.out.println("================================================");
    	System.out.println("以下為用for + do while迴圈製作九九乘法表");
    	// 用for + do while迴圈製作九九乘法表
    	for( i = 1; i <= 9; i++ ) {
    		j = 1;
    		do {
    			System.out.print(i + "*" + j + "=" + i * j + "\t");
    			j++;
    		}while( j <= 9 );
    		System.out.println();
    	}
    	
		System.out.println("================================================");
    	System.out.println("以下為用while + do while迴圈製作九九乘法表");
    	// 用while + do while迴圈製作九九乘法表
    	i = 1;
    	while( i <= 9 ) {
    		j = 1;
    		do {
        		System.out.print(i + "*" + j + "=" + i * j + "\t");
        		j++;
        	}while( j <= 9 );
        	i++;
        	System.out.println();
    	}
    }
}
