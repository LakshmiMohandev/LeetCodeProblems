package algorithms;

public class BinarySearch {

	private int[] input = new int[] {1,2,3,4,5,6};
	int find = 3;
	public boolean binarySearch(int[] input, int find){
		if(input.length == 0 || input == null) return false;
		int low = 0, high = input.length-1;
		
		while(low<=high){
			int mid = low + (high-low)/2;
			
			if(find>mid){
				low=mid+1;
			}
			else if(find<mid){
				high = mid-1;
			}
			else
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		BinarySearch b = new BinarySearch();
		boolean result = b.binarySearch(b.input, b.find);
		if(result) 
			System.out.println(true);
		else
			System.out.println(false);
	}

}
