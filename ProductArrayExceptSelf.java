/*
 * 238. Product of Array Except Self
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].*/

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        
        for(int i=0, temp = 1; i<nums.length;i++){
            output[i] = temp;
            temp *= nums[i];
        }
        for (int i = nums.length - 1, temp = 1; i >= 0; i--) {
            output[i] *= temp;
            temp *= nums[i];
        }
        return output;
    }
}
