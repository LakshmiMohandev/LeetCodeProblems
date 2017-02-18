/*
 * 144. Binary Tree Preorder Traversal
 * Given a binary tree, return the preorder traversal of its nodes' values.
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack();
        TreeNode n = root;
        while (n != null) {
            res.add(n.val);
            if(n.right != null) {
                s.push(n.right);
            }
             if (n.left != null) {
                s.push(n.left);
            }
            n = s.empty() ? null : s.pop();
        }
        return res;
    }
}