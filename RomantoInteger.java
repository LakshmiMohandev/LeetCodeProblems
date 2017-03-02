/*
 * 13. Roman to Integer
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 */

public class Solution {
    public int romanToInt(String s) {
        if(s == null || s.length() == 0)
            return 0;
        int len = s.length();
        int sum = 0;
        int prev = 0;
        
        for(int i=len-1; i>=0; i--){
            int cur = romanIntTable(s.charAt(i));
        
            if(i == len-1){
                sum = sum + cur;
            }
            else{
                if(cur<prev){
                    sum = sum - cur;
                }
                else{
                    sum =sum + cur;
                }
            }
            prev = cur;
        }
        return sum;
    }


public int romanIntTable(char c){
    int num = 0;
    switch(c){
        case 'I': num = 1;
                  break;
        case 'V': num = 5;
                  break;
        case 'X': num = 10;
                  break;
        case 'L': num = 50;
                  break;
        case 'C': num = 100;
                  break;
        case 'D': num = 500;
                  break;
        case 'M': num = 1000;
                  break;
        default: num = 0;
                  break;
    }
    return num;
}

}