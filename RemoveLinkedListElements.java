/*
 * 203. Remove Linked List Elements
 * Remove all elements from a linked list of integers that have value val.*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        while (head != null && head.val == val) 
            head = head.next;
            
        ListNode current = head;
        
        while(current != null && current.next != null){
                if(current.next.val == val){
                    current.next=current.next.next;
                }
                else{
                    current = current.next;
                } 
        }
        return head;
    }
}

/*
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
*/