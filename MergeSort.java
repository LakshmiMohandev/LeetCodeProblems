package algorithms;

public class MergeSort {

	public void divide(int low, int high, int[] input, int[] helper){
		
		
		if(low<high){
			int mid = low + (high-low)/2;
			//divide left part until it can no further be divided
			divide(low,mid, input, helper);
			//divide right part until it can no further be divided
			divide(mid+1, high, input, helper);
			//now merge the sorted elements
			merge(low, mid, high, input, helper);
		}
	}
	
	public void merge(int low, int mid, int high, int[] input, int[] helper){
		
		for(int i=0; i<input.length; i++)
			helper[i]=input[i];
		
		
		int start=low, middle=mid+1, startK=low;
		
		while(start<=mid && middle<=high){
			if(helper[start]<=helper[middle]){
				input[startK] = helper[start];
				start++;
			}
			else{
				input[startK] = helper[middle];
				middle++;
			}
			startK++;
		}
		
		//copy rest of the elements from helper[] into the target array
		while(start <= mid){
			input[startK] = helper[start];
			startK++;
			start++;
			
		}
	}	
	
	public static void main(String[] args) {
		int[] input = new int[] {7,4,9,3,6};
		int length = input.length;
		int[] helper = new int[length];
		
		
		MergeSort m = new MergeSort();
		m.divide(0, length-1, input, helper);
		
		for(int i=0; i<length; i++)
			System.out.print(input[i]+" ");
	}

}

/*
input [7,4,9,7,4,3,5,6,7]

*/