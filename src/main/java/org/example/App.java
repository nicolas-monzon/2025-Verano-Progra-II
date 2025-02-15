package org.example;

import org.example.model.BinaryTree;
import org.example.model.Dictionary;
import org.example.model.DynamicBinaryTree;
import org.example.model.StaticDictionary;
import org.example.util.DictionaryUtil;

public class App {

    public static void main(String[] args) {
        BinaryTree binaryTree = new DynamicBinaryTree(5);
        binaryTree.addLeft(2);
        binaryTree.addRight(3);
        binaryTree.getLeft().addLeft(1);
        binaryTree.getLeft().addRight(1);
        binaryTree.getRight().addLeft(1);
        binaryTree.getRight().addRight(2);
        binaryTree.getRight().getRight().addLeft(1);
        binaryTree.getRight().getRight().addRight(1);
    }

}
