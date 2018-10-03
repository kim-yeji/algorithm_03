package sort;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Integer[] list = null;
		String cnt = "";

		cnt = "100";
		System.out.println("============== " + cnt + "개 테스트 ===============");

		list = FileReading.readFileForList(cnt);
		list.quickSort(list, 0, list.length - 1);
		list = FileReading.readFileForList(cnt);
		list.mergeSort();

		cnt = "1000";
		System.out.println("============== " + cnt + "개 테스트 ===============");

		list = FileReading.readFileForList(cnt);
		list.quickSort();
		list = FileReading.readFileForList(cnt);
		list.mergeSort();

	}

}
