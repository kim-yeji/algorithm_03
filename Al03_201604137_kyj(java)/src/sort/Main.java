package sort;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Integer[] list = null;
		String cnt = "";
		
		try {
			cnt = "100";
			System.out.println("============== " + cnt + "개 테스트 ===============");
	
			list = FileReading.readFileForList(cnt);
			Sorting sort = new Sorting(list);
			sort.print();
			sort.sorting("merge");
			System.out.println("============== " + cnt + "개 테스트 ===============");
			sort.print();
//			sort.mergeSort();
//			list = FileReading.readFileForList(cnt);
//			list.mergeSort();
//	
//			cnt = "1000";
//			System.out.println("============== " + cnt + "개 테스트 ===============");
//	
//			list = FileReading.readFileForList(cnt);
//			list.quickSort();
//			list = FileReading.readFileForList(cnt);
//			list.mergeSort();
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}
