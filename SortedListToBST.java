/*
 * 109. Convert Sorted List to Binary Search Tree
 * Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    static ListNode h;
    
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) 
            return null;
        h=head;
        ListNode temp = head;
        int length = 0;
        
        while(temp != null){
            temp=temp.next;
            length++;
        }
        
        return convertListToBST(0,length-1);
    }
    
    public TreeNode convertListToBST(int start, int end){
        if(start > end) 
            return null;
        
        int mid = (start+end)/2;
        
        TreeNode left = convertListToBST(start, mid-1);
        TreeNode root = new TreeNode(h.val);
        h=h.next;
        TreeNode right = convertListToBST(mid+1, end);
        
        root.left = left;
        root.right = right;
        
        return root;
    }
}