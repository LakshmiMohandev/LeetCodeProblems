/*
 * 53. Maximum Subarray
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4], the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */

public class Solution {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(sum, 0) + nums[i];
            result = Math.max(result, sum);
        }
        return result;
    }
}

/*
   0 1  2 3  4 5 6  7 8
A[-2,1,-3,4,-1,2,1,-5,4]
i=0 -> sum=0+(-2)=-2  res=-2
i=1 -> sum=0+1=1 res=1
i=2 -> sum=1+-3=-2 res=1
i=3 -> sum=0+4=4 res=4
i=4 -> sum=4+-1=3 res=4
i=5 -> sum=3+2=5 res=5
i=6 -> sum=5+1=6 res=6
i=7 -> sum=6+-5=1 res=6
i=8 -> sum=1+4=5 res=6

*/