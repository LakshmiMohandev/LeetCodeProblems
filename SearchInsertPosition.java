/*
 * 35. Search Insert Position
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 */

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }
}

/*
     0 1 2
nums[2,4,6], target=3
low=0 high=2
loop1
mid=(0+2)/2=1
if nums[1]->4==3  NO
else if 4>3  YES then high=1-1=0

loop2
mid=0+0/2=0
if nums[0]->2==3  NO
else if 2>3     NO
else low=0+1

return 1

*/