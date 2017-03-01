package algorithms;

public class QuickSort {

	private int[] input = new int[] {5,4,8,3,2,1,9};
	private int length = input.length;
	
	public void quickSort(int left, int right){
		int i=left, j=right;
		
		int pivot = input[left+(right-left)/2];
		
		while(i<=j){
			while(input[i]<pivot){
				i++;
			}
			while(input[j]>pivot){
				j--;
			}
			
			if(i<=j){
				swap(i,j);
				i++;
				j--;
			}
			
		}
		
		if(left<j){
			quickSort(left, j);
		}
		if(i<right){
			quickSort(i, right);
		}
	}
	
	public void swap(int i, int j){
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		QuickSort q = new QuickSort(); 
		if(q.input == null || q.length==0){
			return;
		}
		q.quickSort(0, q.length-1);
		for(int i=0; i<q.length;i++)
			System.out.println(q.input[i]);
	}

}
