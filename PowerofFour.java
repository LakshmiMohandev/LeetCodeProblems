/*
 * 342. Power of Four
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.*/

public class Solution {
    public boolean isPowerOfFour(int num) {
        if(num == 1) return true;
        
        while(num>0){
            int temp = num%4;
            if(temp == 0){
                num=num/4;
                if(num == 1)
                    return true;
            }
            else
                return false;
        }
        return false;
    }
}