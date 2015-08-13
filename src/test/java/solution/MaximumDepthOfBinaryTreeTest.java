package solution;

import bean.TreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * 1. 可以用递归
 * 2. BFS
 * Created by wzk on 15/8/13.
 */
public class MaximumDepthOfBinaryTreeTest {

    TreeNode root = null;

    @Before
    public void before() {
        root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode l2 = new TreeNode(2);
        TreeNode l11 = new TreeNode(3);
        TreeNode l12 = new TreeNode(3);
        TreeNode l111 = new TreeNode(4);
        TreeNode l1111 = new TreeNode(5);

        root.left = l1;
        root.right = l2;
        l1.left = l11;
        l2.right = l12;

//        l11.left = l111;
//        l111.left = l1111;
    }

    @Test
    public void test() {
        MaximumDepthOfBinaryTree mt = new MaximumDepthOfBinaryTree();
        int depth = mt.maxDepth(root);
        System.out.println(depth);
    }



}
