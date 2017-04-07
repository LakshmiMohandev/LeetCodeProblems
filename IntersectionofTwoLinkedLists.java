/*
 * 160. Intersection of Two Linked Lists
 * Write a program to find the node at which the intersection of two singly linked lists begins.*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        
        int len1=0, len2=0;
        ListNode a = headA;
        ListNode b = headB;
        
        while(a != null){
            len1++;
            a = a.next;
        }
        while(b != null){
            len2++;
            b=b.next;
        }
        a=headA;
        b=headB;
        
        int difference = 0;
        
        if(len1>len2){
            difference = len1-len2;
            int i=0;
            while(i<difference){
                a=a.next;
                i++;
            }
        }else{
            difference = len2-len1;
            int i=0;
            while(i<difference){
                b=b.next;
                i++;
            }
        }
        
        while(a != null && b != null){
            if(a == b)
                return a;
            a=a.next;
            b=b.next;
        }
        
        return null;
    }
}
