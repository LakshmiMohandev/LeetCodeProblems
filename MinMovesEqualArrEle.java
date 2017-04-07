/*
 * 453. Minimum Moves to Equal Array Elements
 * Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.*/

public class Solution {
    public int minMoves(int[] nums) {
        if (nums.length == 0) return 0;
        int countMoves=0, min = Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length; i++){
            min = Math.min(min, nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            countMoves = countMoves + nums[i] - min;
        }
        
        return countMoves;
    }
}

