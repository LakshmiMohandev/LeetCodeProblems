/*
 * 234. Palindrome Linked List
 * Given a singly linked list, determine if it is a palindrome.*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head, fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next; //move pointer slow to middle of linked list
            fast = fast.next.next; //move fast pointer to the end of linked list
        }
        
        if(fast != null)//odd nodes: let right half be smaller
            slow = slow.next;
        
        slow=reverse(slow);
        fast=head;
        while(slow != null){
            if(fast.val != slow.val){
                return false;
            }
            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev=head;
            head=next;
            
        }
        return prev;
    }
}