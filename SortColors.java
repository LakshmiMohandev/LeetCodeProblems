/*
 * 75. Sort Colors
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue. Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.*/

public class Solution {
    public void sortColors(int[] nums) {
        int k=0, j=nums.length-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0 && i>k)
                swap(nums[i--], nums[k++]);
            else if(nums[i] == 2 && i!=j)
                swap(nums[i--], nums[j--]);
        }
    }
    
    public void swap(int i, int j){
        int temp = i;
        i=j;
        j=temp;
    }
}