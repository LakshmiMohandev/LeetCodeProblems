/*
 * 442. Find All Duplicates in an Array
 * Find all the elements that appear twice in this array.*/

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i]);
            if(nums[index-1] > 0){
                nums[index-1] = -nums[index-1];
            } else{
                result.add(Math.abs(nums[i]));
            }
        }
        
        return result;
    }
}