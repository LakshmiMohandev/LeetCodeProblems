/*
 * 520. Detect Capital
 * Given a word, you need to judge whether the usage of capitals in it is right or not.*/

public class Solution {
    public boolean detectCapitalUse(String word) {
        /*define states:
        state = 0 -> all capitals
        state = 1 -> all lower case
        state = 2 -> first capital rest lower case
        state = 3 -> any other invalid input
        */
        if(word.length()<=1) return true;
        
        int state=0;
        if(isCapital(word.charAt(0)) && isCapital(word.charAt(1))){
            state = 0;
        } else if(!isCapital(word.charAt(0)) && !isCapital(word.charAt(1))){
            state = 1;
        } else if(isCapital(word.charAt(0)) && !isCapital(word.charAt(1))){
            state = 2;
        } else if(!isCapital(word.charAt(0)) && isCapital(word.charAt(1))){
            state = 3;
            return false;
        }
        
        for(int i = 2; i < word.length(); i++){
            if(state == 0 && !isCapital(word.charAt(i))){
                state = 3;
                return false;
            } else if(state == 1 && isCapital(word.charAt(i))){
                state = 3;
                return false;
            } else if(state == 2 && isCapital(word.charAt(i))){
                state = 3;
                return false;
            }
        }
        
        return true;
    }
    
    public boolean isCapital(char ch){
        if(ch >= 'A' && ch <= 'Z')
            return true;
        else
            return false;
    }
}