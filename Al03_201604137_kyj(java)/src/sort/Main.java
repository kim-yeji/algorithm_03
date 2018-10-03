package sort;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Integer[] list = null;
		String cnt = "";
		
		try {
			cnt = "10";
			System.out.println("============== " + cnt + "개 테스트 ===============");
	
			list = FileReading.readFileForList(cnt);
			Sorting sort = new Sorting(list);
//			sort.originPrint();		//정렬배열 출력
			sort.sorting("merge");	//정렬
			sort.printCount();		//반복회수 출력
			sort.sortingPrint();	//정렬배열 출력
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
