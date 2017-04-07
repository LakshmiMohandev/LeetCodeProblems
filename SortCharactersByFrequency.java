/*
 * 451. Sort Characters By Frequency
 * Given a string, sort it in decreasing order based on the frequency of characters.*/

public class Solution {
    public String frequencySort(String s) {
        int max=0;
        if (s == null)
            return null;
            
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i),0);
        }
        
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
                max = Math.max(max, map.get(s.charAt(i)));
            }
            
        }
        List<Character>[] array = buildArray(map, max);

        return buildString(array);
    }
    
    private List<Character>[] buildArray(Map<Character, Integer> map, int maxCount) {
    List<Character>[] array = new List[maxCount + 1];
    for (Character c : map.keySet()) {
        int count = map.get(c);
        if (array[count] == null) {
            array[count] = new ArrayList();
        }
        array[count].add(c);
    }
    return array;
    }
    
    private String buildString(List<Character>[] array) {
    StringBuilder sb = new StringBuilder();
    for (int i = array.length - 1; i > 0; i--) {
        List<Character> list = array[i];
        if (list != null) {
            for (Character c : list) {
                for (int j = 0; j < i; j++) {
                    sb.append(c);
                }
            }
        }
    }
    return sb.toString();
    }
}