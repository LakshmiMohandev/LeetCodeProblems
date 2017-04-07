/*
 * 492. Construct the Rectangle*/

public class Solution {
    public int[] constructRectangle(int area) {
        int i = 0, j = area; //20=5*4,10*2,20*1
        int[] result = new int[2];
        while (i <= j){
            long product = i*j;
            if (product == area){
                result[0] = j--;
                result[1] = i++;
            } else if (product > area){
                j--;
            } else {
                i++;
            }
        }
        return result;
    }
}