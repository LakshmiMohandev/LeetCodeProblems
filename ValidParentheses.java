/*
 * 20. Valid Parentheses
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

public class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0)
            return false;
        
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        
        map.put('{','}');
        map.put('(',')');
        map.put('[',']');
        
        for(int i=0;i<s.length();i++){
            
            char current = s.charAt(i);
            if(map.keySet().contains(current)){
                stack.push(current);
            }    
            else if(map.values().contains(current)){
                    if(!stack.empty() && map.get(stack.peek()) == current){
                        stack.pop();   
                    }
                    else{
                        return false;
                    }
                        
            }
        }
        if(!stack.empty())
            return false;
        return true;
    }
}