/*
 * 347. Top K Frequent Elements
 * Given a non-empty array of integers, return the k most frequent elements.*/

public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //List<Integer> result = new ArrayList<>();
        int count=0,max=0;
        
        for(int i:nums){
            if(map.containsKey(i)){
                count = map.get(i);
                count+=1;
                map.put(i, count);
            } else{
                map.put(i, 1);
            }
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<Map.Entry<Integer, Integer>>((o1, o2) -> o2.getValue() - o1.getValue());//setting an ordering condition on priority queue
        pq.addAll(map.entrySet());
    
        List<Integer> ret = new ArrayList<>();
        for(int i = 0; i < k; i++){
            ret.add(pq.poll().getKey());
        }
        
        return ret;
    }
}