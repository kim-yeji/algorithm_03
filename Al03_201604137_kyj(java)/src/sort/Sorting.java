package sort;
import java.util.Arrays;
import java.util.Random;

public class Sorting {
	private int[] sorted;	//정렬 후 결과배열
	private int[] paramArr;	//원배열
	private int count;		//반복회수
	
	public void printCount(){
		System.out.println("반복회수: "+count);
	}
	
	public Sorting(Integer[] list){
		sorted = new int[list.length];
		paramArr = new int[list.length];
		for(int i = 0; i < list.length; i++){
			paramArr[i] = list[i].intValue();
		}
	}
	
	public void print(){
		for(int i=0; i<sorted.length; i++){
			System.out.println((i+1)+":"+sorted[i]);
		}
//		Arrays.stream(sorted).forEach(s -> System.out.println(s));
	}
	
	public void sorting(String sort){
		if("merge".equals(sort)) {
			mergeSort(0, paramArr.length-1, paramArr);
		} else if("quick".equals(sort)) {
			
		}
	}

	///////////////////////////////////// merge sort/////////////////////////////////////

	public void mergeSort(int left, int right, int[] arr) {

		int mid;
		if (left < right) {
			if(left + right < 8) {
				insertionSort(arr);
			}else {
				mid = (left + right) / 2;
				mergeSort(left, mid, arr);
				mergeSort(mid + 1, right, arr);
				merge(left, mid, right, arr);
			}
		}
	}
	

	public void merge(int left, int mid, int right, int[] arr) {
		int l = left;
		int m = mid + 1;
		int k = left;

		while (l <= mid || m <= right) {
			if (l <= mid && m <= right) {
				if (arr[l] <= arr[m]) {
					sorted[k] = arr[l++];
				} else {
					sorted[k] = arr[m++];
				}
			} else if (l <= mid && m > right) {
				sorted[k] = arr[l++];
			} else {
				sorted[k] = arr[m++];
			}
			
			count++;
			k++;
		}

		for (int i = left; i < right + 1; i++) {
			arr[i] = sorted[i];
			count++;
		}

//		System.out.println("반복횟수 = "+count);
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
