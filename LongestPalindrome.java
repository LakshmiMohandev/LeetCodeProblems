
/*
 * 409. Longest Palindrome
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.*/
public class Solution {
    public int longestPalindrome(String s) {
        int res=0;
        int[] ascii = new int[128];
        
        for(int i=0; i<s.length(); i++){
			ascii[s.charAt(i)]++; //a:1,c:5,d:2
		}
		
		for(int i=0; i<128; i++){
			if(ascii[i]%2==0){
				res+=ascii[i]; //2
			}else{
				res+=ascii[i]-1;//4
			}
		}
		if(res<s.length()) return res+1;//7
		return res;
    }
}
//bb
