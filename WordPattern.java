/*
 * 290. Word Pattern
 * Given a pattern and a string str, find if str follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 * Examples:
 * pattern = "abba", str = "dog cat cat dog" should return true.
 * pattern = "abba", str = "dog cat cat fish" should return false.
 */

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern == null && str == null)
            return true;
        if(pattern == null || str == null)
            return false;
        char chars[] = pattern.toCharArray();
        String[] tokens = str.split(" "); 
        
        if(chars.length != tokens.length)
            return false;
            
        HashMap<Character, String> hmap = new HashMap<Character, String>();
        HashSet<String> tokenSet = new HashSet<String>();
        
        for(int i=0; i<chars.length; i++){
            if(hmap.containsKey(chars[i]) && hmap.get(chars[i]).equals(tokens[i])){
                continue;
            }
            else if(!hmap.containsKey(chars[i]) && !tokenSet.contains(tokens[i])){
                hmap.put(chars[i], tokens[i]);
                tokenSet.add(tokens[i]);
            } 
            else{
                return false;
            }
        }
        return true;
    }
}