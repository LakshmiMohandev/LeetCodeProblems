/*
 * 448. Find All Numbers Disappeared in an Array*/

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int len = nums.length;
        List<Integer> res = new ArrayList<>();
        
        for(int i=0; i<len; i++){
            set.add(nums[i]);
        }
        for(int i=1; i<=len; i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}
