/*
 * 485. Max Consecutive Ones
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 */

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0, result=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                count=0;
            }
            else{
                count++;
                result=Math.max(count, result);
            }
        }
        return result;
    }
}