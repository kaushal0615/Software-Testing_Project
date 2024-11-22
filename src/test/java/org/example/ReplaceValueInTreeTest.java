package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReplaceValueInTreeTest {

    @Test
    void testReplaceValueInTree_Example1() {
        ReplaceValueInTree.TreeNode root = new ReplaceValueInTree.TreeNode(5,
                new ReplaceValueInTree.TreeNode(4,
                        new ReplaceValueInTree.TreeNode(1),
                        new ReplaceValueInTree.TreeNode(10)),
                new ReplaceValueInTree.TreeNode(9, null,
                        new ReplaceValueInTree.TreeNode(7))
        );

        ReplaceValueInTree solution = new ReplaceValueInTree();
        ReplaceValueInTree.TreeNode result = solution.replaceValueInTree(root);

        assertEquals(0, result.val);
        assertEquals(0, result.left.val);
        assertEquals(0, result.right.val);
        assertEquals(7, result.left.left.val);
        assertEquals(7, result.left.right.val);
        assertEquals(11, result.right.right.val);
    }

    @Test
    void testReplaceValueInTree_Example2() {
        ReplaceValueInTree.TreeNode root = new ReplaceValueInTree.TreeNode(3,
                new ReplaceValueInTree.TreeNode(1),
                new ReplaceValueInTree.TreeNode(2)
        );

        ReplaceValueInTree solution = new ReplaceValueInTree();
        ReplaceValueInTree.TreeNode result = solution.replaceValueInTree(root);

        assertEquals(0, result.val);
        assertEquals(0, result.left.val);
        assertEquals(0, result.right.val);
    }

    @Test
    void testReplaceValueInTree_SingleNode() {
        ReplaceValueInTree.TreeNode root = new ReplaceValueInTree.TreeNode(10);

        ReplaceValueInTree solution = new ReplaceValueInTree();
        ReplaceValueInTree.TreeNode result = solution.replaceValueInTree(root);

        assertEquals(0, result.val);
    }

    @Test
    void testReplaceValueInTree_ComplexTree() {
        ReplaceValueInTree.TreeNode root = new ReplaceValueInTree.TreeNode(49,
                new ReplaceValueInTree.TreeNode(40,
                        new ReplaceValueInTree.TreeNode(42),
                        new ReplaceValueInTree.TreeNode(7)),
                new ReplaceValueInTree.TreeNode(35,
                        null,
                        new ReplaceValueInTree.TreeNode(34))
        );

        ReplaceValueInTree solution = new ReplaceValueInTree();
        ReplaceValueInTree.TreeNode result = solution.replaceValueInTree(root);

        assertEquals(0, result.val);
        assertEquals(0, result.left.val);
        assertEquals(0, result.right.val);
        assertEquals(34, result.left.left.val);
        assertEquals(34, result.left.right.val);
        assertEquals(49, result.right.right.val);
    }
}
