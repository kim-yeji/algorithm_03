package sort;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Integer[] list = null;
		String cnt = "";
		
		try {
			cnt = "10";
			System.out.println("============== " + cnt + "�� �׽�Ʈ ===============");
	
			list = FileReading.readFileForList(cnt);
			Sorting sort = new Sorting(list);
//			sort.originPrint();		//���Ĺ迭 ���
			sort.sorting("merge");	//����
			sort.printCount();		//�ݺ�ȸ�� ���
			sort.sortingPrint();	//���Ĺ迭 ���
//	
//			cnt = "1000";
//			System.out.println("============== " + cnt + "�� �׽�Ʈ ===============");
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
