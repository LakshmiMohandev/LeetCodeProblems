/*
 * 11. Container With Most Water
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.*/

public class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length-1, maxArea = 0;
        
        while(start<end){
            maxArea = Math.max(maxArea, Math.min(height[start], height[end]) * (end - start)); 
            //Math.min(height[start], height[end]) * (end - start) -> to see how much maximum amt of water those two lines can accomodate
            if(height[start]<height[end])
                start++;
            else
                end--;
        }
        return maxArea;
    }
}
/*
        0 1 2 3 4 5
height [2,4,3,1,5,3]
        s         end
*/        
