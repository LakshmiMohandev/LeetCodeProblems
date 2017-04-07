/*
 * 41. First Missing Positive
 * Given an unsorted integer array, find the first missing positive integer.*/

public class Solution {
    public int firstMissingPositive(int[] nums) {

	int i = 0, n = nums.length;//4
	while (i < n) {//0,1
        // If the current value is in the range of (0,length) and it's not at its correct position, 
        // swap it to its correct position.
        // Else just continue;
		if (nums[i] >= 0 && nums[i] < n && nums[nums[i]] != nums[i])
			swap(nums, i, nums[i]);//0,3; 0,4; 
		else
			i++;//1;2;3
	}//1,4,-1,3; 4,1,-1,3; 
	int k = 1;

    // Check from k=1 to see whether each index and value can be corresponding.
	while (k < n && nums[k] == k)
		k++;

    // If it breaks because of empty array or reaching the end. K must be the first missing number.
	if (n == 0 || k < n)
		return k;
	else   // If k is hiding at position 0, K+1 is the number. 
		return nums[0] == k ? k + 1 : k;

}

private void swap(int[] nums, int i, int j) {
	int temp = nums[i];
	nums[i] = nums[j];
	nums[j] = temp;
}
}