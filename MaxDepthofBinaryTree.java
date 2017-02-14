/*
 * 104. Maximum Depth of Binary Tree
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
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
import java.util.Stack;
public class Solution {
        public boolean result = true;
        public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return result;
        }
    public int maxDepth(TreeNode root){
        if (root == null)
           return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (Math.abs(l - r) > 1)
          result = false;
        return 1 + Math.max(l, r);
       }
}


