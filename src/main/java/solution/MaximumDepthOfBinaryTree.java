package solution;

import bean.TreeNode;

import java.util.LinkedList;

/**
 * Created by wzk on 15/8/12.
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        int depth = 0;
        int levelCount = 1;
        int nextLevelCount = 0;
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        list.add(root);

        while(!list.isEmpty()) {
            TreeNode t = list.pop();
            levelCount--;

            if (t.left != null) {
                list.add(t.left);
                nextLevelCount++;
            }
            if (t.right != null) {
                list.add(t.right);
                nextLevelCount++;
            }

            if (levelCount == 0) {
                levelCount = nextLevelCount;
                nextLevelCount = 0;
                depth++;
            }
        }

        return depth;
    }

}
