/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversalResult = new ArrayList<>();
        Stack<TreeNode> nodes = new Stack<>();
        TreeNode currentNode = root;
        while(currentNode != null || !nodes.isEmpty()){
            while(currentNode != null){
                nodes.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = nodes.pop();
            traversalResult.add(currentNode.val);
            currentNode = currentNode.right;
        }
        return traversalResult;
    }
}