/*
 * 242. Valid Anagram
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * Note: You may assume the string contains only lowercase alphabets.
 */

public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length() != t.length())
            return false;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if(!hm.containsKey(a))
                hm.put(a, 1);
            else{
                count = hm.get(a);
                hm.put(a, count + 1);
            }
        }
        
        for(int i = 0; i < s.length(); i++)
        {
            char b = t.charAt(i);
            if(!hm.containsKey(b))
             return false;
            else{
                count = hm.get(b);
                hm.put(b, count - 1);
                
            }
        
        }
        for (Integer value : hm.values())
        {
            if(value != 0)
             return false;
        }
        return true;
    }
}