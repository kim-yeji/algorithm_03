package sort;
import java.util.Arrays;
import java.util.Random;

public class Sorting {
	private int[] sorted;
	private int count=0;
	
	public Sorting(Integer[] list){
		sorted = new int[list.length];
		for(int i = 0; i < list.length; i++){
			sorted[i] = list[i].intValue();
		}
	}
	
	public void print(){
		Arrays.stream(sorted).forEach(s -> System.out.println(s));
	}
	
	public void sorting(String sort){
		if("merge".equals(sort)) {
			mergeSort( sorted, 0, sorted.length-1);
		} else if("quick".equals(sort)) {
			
		}
	}

	///////////////////////////////////// merge sort/////////////////////////////////////


	public  void mergeSort(int arr[], int l, int r) {
		if(l<r) {
			
			int mid = (l+r)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			merge(arr, l, mid, r);
			}
		
	}
	public  void merge(int arr[], int l, int mid, int r) {
		
		int i = l;
		int j = mid+1;
		int k = l;
		int temp[] = new int[arr.length];
		while(i<=mid && j<=r) {
			if(arr[i] < arr[j]) {
				temp[k++] = arr[i++];
				count++;
			}else {
				temp[k++] = arr[j++];
				count++;
			}
		}
		while(i<=mid)
			temp[k++] = arr[i++];
		while(j<=r)
			temp[k++] = arr[j++];
		for(int index=l; index<k; index++)
			arr[index] = temp[index];
		System.out.println("반복횟수:"+count);
	}

	///////////////////////////////////// insertion sort/////////////////////////////////////
	public void insertionSort(int[] data) {
		for (int index = 1; index < data.length; index++) {
			int temp = data[index];
			int aux = index - 1;

			while ((aux >= 0) && (data[aux] > temp)) {
				data[aux + 1] = data[aux];
				aux--;
			}
			data[aux + 1] = temp;
		}
	}

	///////////////////////////////////// quick sort/////////////////////////////////////
	public int partition(int arr[], int left, int right) {
		 
		int pivot = arr[right];
	    //int pivot = arr[(left + right) / 2];
	 
	    while (left < right) {
	        while ((arr[left] < pivot) && (left < right))
	            left++;
	        while ((arr[right] > pivot) && (left < right))
	            right--;
	 
	        if (left < right) {
	            int temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;
	        }
	    }
	 
	    return left;
	}
	
	
	public int randomize_partition(int arr[], int left, int right) {
		 
		Random rand = new Random(System.currentTimeMillis());
		int ranNum = Math.abs(rand.nextInt(100));
		int pivot = arr[ranNum];
	    //int pivot = arr[(left + right) / 2];
	 
	    while (left < right) {
	        while ((arr[left] < pivot) && (left < right))
	            left++;
	        while ((arr[right] > pivot) && (left < right))
	            right--;
	 
	        if (left < right) {
	            int temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;
	        }
	    }
	 
	    return left;
	}
	 
	
	 
	public void quickSort(int arr[], int left, int right) {
	 
	    if (left < right) {
	        // 값을 비교하고 로우와 하이를 이동시키면서 값의 교환이 이루어지는 함수
	        int pivotNewIndex = partition(arr, left, right);
	        quickSort(arr, left, pivotNewIndex - 1);
	        quickSort(arr, pivotNewIndex + 1, right);
	    }
	 
	}


}
