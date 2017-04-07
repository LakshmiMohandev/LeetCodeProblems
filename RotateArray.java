/*
 * 189. Rotate Array
 * Rotate an array of n elements to the right by k steps.*/

public class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length; //sometimes k is larger than nums.length eg nums.length=5 and k=12 which means we just have to reverse array 2 times and we achieve it by doing this step
        reverseArr(nums, 0, nums.length-1);  //we have to first reverse the whole array by swapping first element with the last one and so on. eg. 7,6,5,4,3,2,1
        reverseArr(nums, 0, k-1); //reverse the elements from 0 to k-1. eg 7,6,5
        reverseArr(nums, k, nums.length-1); //reverse the elements from k to n-1 eg. 4,3,2,1
    }
    
    public void reverseArr(int nums[], int startIndex, int endIndex){
        while(startIndex < endIndex){
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}