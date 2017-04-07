/*
 * 191. Number of 1 Bits
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).*/

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String nStr = Integer.toBinaryString(n);
        int count =0;
        for(int i=0; i<nStr.length(); i++){
            if(nStr.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}