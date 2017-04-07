/*
 * 125. Valid Palindrome
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.*/

public class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        
        int head=0, tail = s.length()-1;
        char charHead, charTail;
        
        while(head<=tail){
            charHead = s.charAt(head);
            charTail = s.charAt(tail);
            
            if(!Character.isLetterOrDigit(charHead)) head++;
            else if(!Character.isLetterOrDigit(charTail)) tail--;
            else{
                if(Character.toLowerCase(charHead) != Character.toLowerCase(charTail)){
                    return false;
                }
                    head++;
                    tail--;
            }
        }
        return true;
    }
}