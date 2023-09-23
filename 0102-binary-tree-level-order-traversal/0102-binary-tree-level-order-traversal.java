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
class TreeNodeLevelPair {
    private TreeNode node;
    private int level;

    public TreeNodeLevelPair(TreeNode node, int level) {
        this.node = node;
        this.level = level;
    }

    public TreeNode getNode() {
        return node;
    }

    public int getLevel() {
        return level;
    }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<TreeNodeLevelPair> queue = new LinkedList<>();
        queue.add(new TreeNodeLevelPair(root,0));
        while (!queue.isEmpty()) {
            TreeNodeLevelPair presentNode = queue.remove();
            Integer currentNodeLevel = presentNode.getLevel();
            if(result.size() < currentNodeLevel+1)
                result.add(currentNodeLevel, new ArrayList<>());
            result.get(currentNodeLevel).add(presentNode.getNode().val);
            if (presentNode.getNode().left != null)
                queue.add(new TreeNodeLevelPair(presentNode.getNode().left,currentNodeLevel+1));
            if (presentNode.getNode().right != null)
                 queue.add(new TreeNodeLevelPair(presentNode.getNode().right,currentNodeLevel+1));
        }
        return result;
    }
}