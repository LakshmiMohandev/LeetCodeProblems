/*
 * 3. Longest Substring Without Repeating Characters
 * Given a string, find the length of the longest substring without repeating characters.*/

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        
        HashSet<Character> set = new HashSet<>();
        int maxCount = 0, j=0, i=0;
        
        while(i<s.length()){
            
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                maxCount = Math.max(maxCount, set.size());
                i++;
            }
            else{
                set.remove(s.charAt(j++));
            }
        
        }
        return maxCount;
    }
}