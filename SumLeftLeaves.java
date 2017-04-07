/*
 * 404. Sum of Left Leaves
 * Find the sum of all left leaves in a given binary tree.*/

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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        int result=0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);//3
        
        while(!stack.empty()){
            TreeNode temp = stack.pop();//3
            if(temp.left != null){
                if(temp.left.left == null && temp.left.right == null){
                    result += temp.left.val;//9
                }
                else{
                    stack.push(temp.left);
                }
            }
            if(temp.right != null){
                if(temp.right.left != null || temp.right.right != null){
                    stack.push(temp.right);
                }
            }
        }
        
        return result;
    }
}
/*
    3
   / \
  9  20
    /  \
   15   7
   
*/