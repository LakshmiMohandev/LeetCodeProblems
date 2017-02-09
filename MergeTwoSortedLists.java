/*
 * 21. Merge Two Sorted Lists
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list1 = l1;
        ListNode list2 = l2;
        
        ListNode fakehead = new ListNode(0);
        ListNode list = fakehead;
        
        while(list1 != null && list2 != null){
            if(list1.val<=list2.val){
                list.next = list1;
                list1 = list1.next;
            }
            else{
                list.next = list2;
                list2 = list2.next;
            }
            
            list = list.next;
        }
            
            if(list1 != null)
                list.next = list1;
            if(list2 != null)
                list.next = list2;
                
            
        
        return fakehead.next;
    }
}