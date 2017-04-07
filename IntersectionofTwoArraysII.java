/*
 * 350. Intersection of Two Arrays II
 * Given two arrays, write a function to compute their intersection.*/

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        
        if(nums1.length>nums2.length){
            result = intersection(nums1,nums2);
        }
        else{
            result = intersection(nums2,nums1);
        }
        
        return result.stream().mapToInt(i->i).toArray();
    }
    public List<Integer> intersection(int[] inputArr, int[] elements){
        
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> arrList = new ArrayList<>();
            for(int i: inputArr){
                int count = 1;
                if(map.containsKey(i)){
                    count = count + map.get(i);
                    map.put(i,count++);
                }
                else{
                    map.put(i,count++);
                }
                
            }
            for(int i: elements){
                if(map.containsKey(i)){
                    if(map.get(i)<=0){
                        map.remove(i);
                    }
                    else{
                        map.put(i, map.get(i)-1);
                        arrList.add(i);
                    }
                    
                    
                }
        }
        return arrList;    
    }
}