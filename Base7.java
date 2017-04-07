/*
 * 504. Base 7
 * Given an integer, return its base 7 string representation.*/
public class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        
        int temp = num;
        if(num == 0) return "0";
        
        while(temp !=0){
            sb.append(Math.abs(temp%7));
            temp = temp/7;
        }
        
        if(num<0) sb.append("-");
        
        return sb.reverse().toString();
    }
}