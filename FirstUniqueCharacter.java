/*
 * 387. First Unique Character in a String
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.*/

public class Solution {
    public int firstUniqChar(String s) {
        int[] charArray = new int[26];
        for(char ch : s.toCharArray()){
            charArray[ch-'a']++;
        }
        for(int i = 0; i < s.length(); i ++)
            if(charArray [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}
