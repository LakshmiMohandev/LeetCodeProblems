/*
 * 69. Sqrt(x)
 * Compute and return the square root of x.*/

public class Solution {
    public int mySqrt(int x) {
        //return (int) Math.sqrt(x); //shortcut method
        
        long sqRoot = x;
        while(sqRoot*sqRoot > x){
            sqRoot=(sqRoot + x/sqRoot)/2;
        }
        return (int) sqRoot;
    }
}

