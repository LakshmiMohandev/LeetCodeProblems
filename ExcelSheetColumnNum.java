/*
 * 171. Excel Sheet Column Number
 * Given a column title as appear in an Excel sheet, return its corresponding column number.*/

public class Solution {
    public int titleToNumber(String s) {
        if(s == null || s.length() == 0) return 0;
        
        double result=0;
        int t=0, i=s.length()-1;
        
        while(i>=0){
            char curr = s.charAt(i);
            result=result+Math.pow(26,t) * (curr-'A'+1); // (curr-'A'+1) -> equivalent to retriving mapping of a letter from map. eg A->1
            t++;
            i--;
        }
        return (int) result;
    }
    
}