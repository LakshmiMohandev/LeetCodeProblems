/*
 * 7. Reverse Integer
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */

public class Solution {
    public int reverse(int x) {
        int largest = Integer.MAX_VALUE, smallest = Integer.MIN_VALUE;
        long result=0;
        
        while(x !=0 ){
            int unitsPlace = x%10;
            result = (result*10) + unitsPlace;
            if(result>largest) 
                return 0;
            if(result<smallest) 
                return 0;
            x=x/10;
        }
        return (int) result;
    }
}