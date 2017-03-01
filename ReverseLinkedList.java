/*
 * 206. Reverse Linked List
 * Reverse a singly linked list.
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
    public ListNode reverseList(ListNode head) {
        ListNode current, prev, nxt;
        current = head;
        prev = null;
        
        while(current != null)
        {
            nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }
        head = prev;
        return head;
    }
}