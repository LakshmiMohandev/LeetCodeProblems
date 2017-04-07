/*
 * 383. Ransom Note
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 * Each letter in the magazine string can only be used once in your ransom note.*/
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] cnt = new int[26];
        for(char c: magazine.toCharArray()){
            cnt[c-'a']++; //increment character occurence using ascii in cnt[]
        }
        
        for(char c: ransomNote.toCharArray()){
            if(--cnt[c-'a']<0)  //decrement that character from ransomNote 
                return false;
        }
        return true;
    }
}
/*
ransomNode = aa
magazine = aab
*/