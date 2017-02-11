/*
 * 58. Length of Last Word
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); //removes leading and trailing whitespaces
        int lastIndex = s.lastIndexOf(' ') + 1;
        return s.length() - lastIndex;
    }
}

/*
abc def ghi jklm nop qrst uvwx yz-> yz
' '->0
xy' '->xy
x y->y
x' '' 'y ->y
xyz->xyz
endI = 3
String word='';

temp = str.chatAt(i); //z,y,x
word=temp+word // xyz

nmkj

toCharArray() -> O(n)
charAt() ->O(1)
length()->O(1)
*/
/* this approach -----> gives runtime error -> string index is negative
if(s.length() == 0 || s.length() == 1){
            return s.trim().length();
        }
            
        int endIndex = s.length()-1;
        //xyx
        //count trailing spaces and get last char in endIndex
        while(s.charAt(endIndex) == ' '){
            
                endIndex = endIndex - 1;
        }
        
        int len = endIndex;
        
        //String word=' ';
        char temp=' ';
        
        while(s.charAt(endIndex) != ' '){
            temp = s.charAt(endIndex);//2-z,1-y,0-x
            
            // word = temp+word;
            endIndex--;// 1,0,-1
            if(temp==' '){
                return len-endIndex;//
            }
            if(endIndex<0) return len-endIndex;
        }
        return len-endIndex;
        //return word.length();
*/