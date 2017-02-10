/*
 * 235. Lowest Common Ancestor of a Binary Search Tree
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode m = root;
        
        if(m.val>p.val && m.val<q.val)
            return m;
        else if(m.val>p.val && m.val>q.val)
            return lowestCommonAncestor(root.left,p,q);
        else if(m.val<p.val && m.val<q.val)
            return lowestCommonAncestor(root.right, p ,q);
            
        return root;
    }
}