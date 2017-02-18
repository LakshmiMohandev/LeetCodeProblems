/*
 * 344. Reverse String
 * Write a function that takes a string as input and returns the string reversed.
 */

public class Solution {
    public String reverseString(String s) {
        char[] c = s.toCharArray();
        char temp;
        int i,j;
        int len=s.length();
        for(i=0,j=len-1; i<len/2; i++,j--){
            temp=c[i];
            c[i]=c[j];
            c[j]=temp;
        }
        return String.valueOf(c);
    }
}