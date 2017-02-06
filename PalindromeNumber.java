/*
 * 9. Palindrome Number
 * Determine whether an integer is a palindrome. Do this without extra space.
 */

public class Solution {
    public boolean isPalindrome(int x) {
    String sx = String.valueOf(x);
    int l = sx.length();
    int lh = l/2;
    for(int i = 0, j = l-1; i <= lh && j >=lh; i++, j--){
        if(sx.charAt(i) != sx.charAt(j)) 
            return false;
    }
    return true;
}
}