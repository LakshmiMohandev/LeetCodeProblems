/*
 * 231. Power of Two
 * Given an integer, write a function to determine if it is a power of two.*/

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        
        while(n>0){
            int m=n%2;
            if(m==0){
                n=n/2;
                if(n==1)
                    return true;
            }
            else 
                return false;
        }
        return false;
    }
}