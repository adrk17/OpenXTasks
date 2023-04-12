package org.openx;

import java.util.Objects;

/**
 * Node class - represents a node in a binary tree with a value and two possible children
 */
public class Node {
    /// Fields
    private Node left;
    private Node right;
    private int value;

    /// Constructors
    public Node(int value) {
        this.value = value;
    }
    public Node(){
        this.value = 0;
    }

    /// Getters and Setters
    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    /// Methods

    /**
     * Recursively checks if the nodes are equal to each other by comparing their values and children
     * @param o - the node to compare to (must be of type Node and not null)
     * @return - true if the nodes are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return value == node.value && Objects.equals(left, node.left) && Objects.equals(right, node.right);
    }

}
