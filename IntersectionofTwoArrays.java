
/*
 * 349. Intersection of Two Arrays
 * Given two arrays, write a function to compute their intersection.
 * */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> nums1Set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        
        for(int i=0; i<nums1.length; i++){
            nums1Set.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            if(nums1Set.contains(nums2[i]))
                intersection.add(nums2[i]);
        }
        int i=0;
        int res[] = new int[intersection.size()];
        for(int num:intersection){
            res[i++]=num;
        }
        return res;
    }
}