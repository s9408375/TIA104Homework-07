package hw4;

public class Test4 {
	public static void main(String[] args) {
		// 班上有8位同學，他們進行了6次考試結果如下：
		// 請算出每位同學考最高分的次數
		
		// 列出二維陣列中每位學生的分數
		int[][] score = {
						{10,37,100,77,98,90},
						{35,75,70,95,70,80},
						{40,77,79,70,89,100},
						{100,89,90,89,90,75},
						{90,64,75,60,75,50},
						{85,75,70,75,90,20},
						{75,70,79,85,89,99},
						{70,95,90,89,90,75},
						};
		
		// 儲存每位同學考最高分的次數
	    int[] highestCount = new int[8];
	    
	    int student = 0;
	    int exam = 0;
	    int maxScore = -1;
	    int topScoreStudent = 0; // 紀錄最高分的學生索引
	    
	    
	    for(exam = 0; exam < score[0].length; exam++) {
	    	
	    	// 為了避免學生有考0分,必須設定最高分的起始分數為-1
	    	maxScore = -1;
	    	
	    	// 找出最高分並將最高分數覆蓋 maxScore 這個變數
	    	for(student = 0;student < score.length; student++) {
	    		if(score[student][exam] > maxScore) {
	    			maxScore = score[student][exam];
	    			topScoreStudent = student;   // 更新獲得最高分的學生的索引
	    		}
	    	}
	    	
	    	// 將獲得最高分的學生的計數加1
	    	highestCount[topScoreStudent] += 1;
	    }	    
	    
	    // 輸出每位同學考最高分的次數
	    for(int i = 0; i < highestCount.length; i++) {
	    	// i + 1是因為索引值從0開始,但對於人辨識號碼則是1~8號故需+1
	        System.out.println("學生" + (i + 1) +"號考最高分數次數為" + highestCount[i] +"次");
	    }
	    
	}
}
