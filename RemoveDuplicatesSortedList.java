/*
 * 83. Remove Duplicates from Sorted List
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = head;
        
        if(head == null || prev.next == null)
            return head;
            
        
        ListNode current = head.next;    
        
        while(current != null){
            
            if(prev.val == current.val){
                prev.next = current.next;
                current = current.next;
            }
            else{
                prev = current;
                current = current.next;
            }
            
        } 
        
        return head;

    }
}