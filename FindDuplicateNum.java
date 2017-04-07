/*
 * 287. Find the Duplicate Number
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.*/

public class Solution {
    public int findDuplicate(int[] nums) {
        //int j=nums.length-1;
        
        for(int i=0; i<nums.length; i++){
            int j=nums.length-1;
            while(j>i){
                if(nums[i] != nums[j]){
                    j--;
                } 
                else{
                    return nums[i];
                }
            }
        }
        return -1;
    }
}