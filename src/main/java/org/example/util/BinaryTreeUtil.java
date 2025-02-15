package org.example.util;

import org.example.model.BinaryTree;

public class BinaryTreeUtil {

    public static int totalNodes(BinaryTree binaryTree) {
        if(binaryTree == null) {
            return 0;
        }

        return 1 + totalNodes(binaryTree.getLeft()) + totalNodes(binaryTree.getRight());
    }

    public static int height(BinaryTree binaryTree) {
        if(binaryTree == null) {
            return 0;
        }

        return 1 + Math.max(height(binaryTree.getLeft()), height(binaryTree.getRight()));
    }

    public static boolean isFull(BinaryTree binaryTree) {
        return totalNodes(binaryTree) == Math.pow(2, height(binaryTree)) - 1;
    }

    public static boolean isComplete(BinaryTree binaryTree) {
        if(binaryTree == null) {
            return true;
        }

        if(binaryTree.getLeft() != null && binaryTree.getRight() == null ||
                binaryTree.getLeft() == null && binaryTree.getRight() != null) {
            return false;
        }

        return isComplete(binaryTree.getLeft()) && isComplete(binaryTree.getRight());
    }

}
