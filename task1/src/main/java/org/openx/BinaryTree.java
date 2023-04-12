package org.openx;

import java.util.Objects;

/**
 * BinaryTree class - represents a binary tree with a root node
 */
public class BinaryTree {
    /// Fields
    private Node root;

    /// Constructors
    public BinaryTree() {
        root = null;
    }
    public BinaryTree(Node root) {
        this.root = root;
    }

    /// Getters and Setters
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    /// Methods

    /**
     * Recursively checks the longest path from the root to a leaf node
     * @param node - starting node to check from
     * @return - the length of the longest path (edge count)
     */
    int getLongestPath(Node node) {
        if (node == null) {
            return 0;
        }
        int left = getLongestPath(node.getLeft());
        int right = getLongestPath(node.getRight());
        return Math.max(left, right) + 1;
    }

    /**
     * Returns the longest path from the root of a tree to a leaf node
     */
    public int getLongestPath() {
        int score = getLongestPath(root);
        return score > 0 ? score - 1 : 0;
    }


    /**
     * Recursively checks the number of leaf nodes in a tree
     * @param node - starting node to check from
     * @return - the number of leaf nodes
     */
    public int getLeavesCount(Node node){
        if (node == null) {
            return 0;
        }
        if (node.getLeft() == null && node.getRight() == null) {
            return 1;
        }
        return getLeavesCount(node.getLeft()) + getLeavesCount(node.getRight());
    }

    /**
     * Returns the number of leaf nodes in a tree starting from the root
     */
    public int getLeavesCount(){
        return getLeavesCount(root);
    }


    /**
     * Recursively checks if two trees are equal to each other by comparing their root nodes and then recursively comparing their children nodes
     * @param o - the tree to compare to (must be of type BinaryTree and not null)
     * @return - true if the trees are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BinaryTree)) return false;
        BinaryTree that = (BinaryTree) o;
        return Objects.equals(root, that.root);
    }


}
