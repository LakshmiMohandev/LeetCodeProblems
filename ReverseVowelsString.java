/*
 * 345. Reverse Vowels of a String
 * Write a function that takes a string as input and reverse only the vowels of a string.*/

public class Solution {
    public String reverseVowels(String s) {
        char[] sArr = s.toCharArray();
        
        HashSet<Character> setVowels = new HashSet<>();
        setVowels.add('a');
        setVowels.add('e');
        setVowels.add('i');
        setVowels.add('o');
        setVowels.add('u');
        setVowels.add('A');
        setVowels.add('E');
        setVowels.add('I');
        setVowels.add('O');
        setVowels.add('U');
        
        int start = 0;
        int end = sArr.length-1;
        
        while(start<end){
            if(setVowels.contains(sArr[start]) && setVowels.contains(sArr[end])){
                char temp = sArr[start];
                sArr[start] = sArr[end];
                sArr[end] = temp;
                start++;
                end--;
            }
            else if(!setVowels.contains(sArr[start])){
                start++;
            }
            else if(!setVowels.contains(sArr[end])){
                end--;
            }

        }
        
        return String.valueOf(sArr);
    }
}
