package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TestTrain {
	public static void main(String[] args) {
		// 在main方法裡透過建構子產生以下7個Train的物件，放到每小題需使用的集合裡
		// - (202, “普悠瑪”, “樹林”, “花蓮”, 400)
		// - (1254, “區間”, “屏東”, “基隆”, 700)
		// - (118, “自強”, “高雄”, “台北”, 500)
		// - (1288, “區間”, “新竹”, “基隆”, 400)
		// - (122, “自強”, “台中”, “花蓮”, 600)
		// - (1222, “區間”, “樹林”, 七堵, 300)
		// - (1254, “區間”, “屏東”, “基隆”, 700)

		List<Train> trains = new ArrayList<>();

		// 需要先使用 Train 的建構子創建每個物件，然後將它們添加到列表中
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", Double.valueOf(400));
		Train t2 = new Train(1254, "區間", "屏東", "基隆", Double.valueOf(700));
		Train t3 = new Train(118, "自強", "高雄", "台北", Double.valueOf(500));
		Train t4 = new Train(1288, "區間", "新竹", "基隆", Double.valueOf(400));
		Train t5 = new Train(122, "自強", "台中", "花蓮", Double.valueOf(600));
		Train t6 = new Train(1222, "區間", "樹林", "七堵", Double.valueOf(300));
		Train t7 = new Train(1254, "區間", "屏東", "基隆", Double.valueOf(700)); // 重複的班次

		trains.add(t1);
		trains.add(t2);
		trains.add(t3);
		trains.add(t4);
		trains.add(t5);
		trains.add(t6);
		trains.add(t7);

		// 1. 請寫一隻程式，能印出不重複的Train物件
		System.out.println("印出不重複的Train物件:");
		List<Train> uniqueTrains = new ArrayList<>(new HashSet<>(trains));

		// 使用迭代器
		Iterator<Train> iterator = uniqueTrains.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();

		System.out.println("===============================");

//		// 使用for迴圈
//		for (int i = 0; i < uniqueTrains.size(); i++) {
//			System.out.println(uniqueTrains.get(i)); // 使用 get 方法
//		}
//		System.out.println();
//
//		System.out.println("===============================");
//
//		// 使用for-each
//		for (Train train : uniqueTrains) {
//			System.out.println(train);
//		}
//		System.out.println();
//
//		System.out.println("===============================");

		// 2. 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出(可印出重複班次)
		System.out.println("以班次編號由大到小印出(可印出重複班次):");
		Collections.sort(trains, new TrainComparator());

		// 使用迭代器
		Iterator<Train> iterator2 = trains.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		System.out.println();

		System.out.println("===============================");
//
//		// 使用for迴圈
//		for (int i = 0; i < trains.size(); i++) {
//			System.out.println(trains.get(i)); // 使用 get 方法
//		}
//		System.out.println();
//
//		System.out.println("===============================");
//
//		// 使用for-each
//		for (Train train : trains) {
//			System.out.println(train);
//		}
//		System.out.println();
//
//		System.out.println("===============================");

		// 3. 讓班次編號由大排到小印出， 還可以不重複印出Train物件
		System.out.println("班次編號由大排到小印出， 還可以不重複印出Train物件:");

		// 將原始列表轉換為不重複的列表
		List<Train> uniqueTrainList = new ArrayList<>(new HashSet<>(trains));
		
		// 進行排序
		Collections.sort(uniqueTrainList, new TrainComparator());
		
		// 使用迭代器
        Iterator<Train> iterator3 = uniqueTrainList.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }
        System.out.println();
//
//		System.out.println("===============================");
//
//        // 使用for迴圈
//        for (int i = 0; i < uniqueTrainList.size(); i++) {
//            System.out.println(uniqueTrainList.get(i)); // 使用 get 方法
//        }
//        System.out.println();
//
//		System.out.println("===============================");
//        
//        // 使用for-each
//		for (Train train : uniqueTrainList) {
//			System.out.println(train);
//		}
	}

	// Comparator 類別
	static class TrainComparator implements Comparator<Train> {

		@Override
		public int compare(Train t1, Train t2) {
			return Integer.compare(t2.getNumber(), t1.getNumber()); // 降序排列

		}
	}
}
