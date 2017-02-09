/*
 * 66. Plus One
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        
        for(int i=len-1; i>=0; i--){
            if(digits[i]==9){
                digits[i]=0;
            }
            else{
                digits[i]= digits[i]+1;
                return digits;
            }
        }
        
        int[] plusOne=new int[len + 1];
        plusOne[0]=1;
        for (int j = 1; j <= len; ++j) {
		    plusOne[j] = digits[j - 1];
	    }
	return plusOne;
    }
}