package org.openx;

import org.junit.Test;

import static org.junit.Assert.*;


public class BinaryTreeTest {
    /// Constructor tests
    @Test
    public void constructorWithNull() {
        BinaryTree tree = new BinaryTree(null);
        assertNull(tree.getRoot());
    }

    @Test
    public void constructorWithNode() {
        Node n = new Node(5);
        BinaryTree tree = new BinaryTree(n);
        assertEquals(n, tree.getRoot());
    }

    @Test
    public void constructorWithNodeWithChildren() {
        Node n = new Node(5);
        Node n1 = new Node(6);
        Node n2 = new Node(7);
        n.setLeft(n1);
        n.setRight(n2);
        BinaryTree tree = new BinaryTree(n);
        assertEquals(n.getLeft(), tree.getRoot().getLeft());
    }

    /// Tests for getLongestPath method
    @Test
    public void getLongestPathWithNull() {
        BinaryTree tree = new BinaryTree(null);
        assertEquals(0, tree.getLongestPath());
    }

    @Test
    public void getLongestPathWithOneNode() {
        Node n = new Node(5);
        BinaryTree tree = new BinaryTree(n);
        assertEquals(0, tree.getLongestPath());
    }

    @Test
    public void getLongestPathWithTwoNodes() {
        Node n = new Node(5);
        Node n1 = new Node(6);
        n.setLeft(n1);
        BinaryTree tree = new BinaryTree(n);
        assertEquals(1, tree.getLongestPath());
    }

    @Test
    public void getLongestPathExampleFromTaskDescription(){
        Node n1 = new Node(5);
        Node n2 = new Node(3);
        Node n3 = new Node(7);
        Node n4 = new Node(2);
        Node n5 = new Node(5);
        Node n6 = new Node(1);
        Node n7 = new Node(0);
        Node n8 = new Node(2);
        Node n9 = new Node(8);
        Node n10 = new Node(5);

        n9.setRight(n10);
        n7.setLeft(n8);
        n7.setRight(n9);

        n3.setLeft(n6);
        n3.setRight(n7);

        n2.setLeft(n4);
        n2.setRight(n5);

        n1.setLeft(n2);
        n1.setRight(n3);


        BinaryTree tree = new BinaryTree(n1);

        assertEquals(4, tree.getLongestPath());
    }

    /// Tests for getLeavesCount method
    @Test
    public void getLeavesCountWithNull() {
        BinaryTree tree = new BinaryTree(null);
        assertEquals(0, tree.getLeavesCount());
    }

    @Test
    public void getLeavesCountWithOneNode() {
        Node n = new Node(5);
        BinaryTree tree = new BinaryTree(n);
        assertEquals(1, tree.getLeavesCount());
    }

    @Test
    public void getLeavesCountWithTwoNodes() {
        Node n = new Node(5);
        Node n1 = new Node(6);
        n.setLeft(n1);
        BinaryTree tree = new BinaryTree(n);
        assertEquals(1, tree.getLeavesCount());
    }

    @Test
    public void getLeavesCountExampleFromTaskDescription() {
        Node n1 = new Node(5);
        Node n2 = new Node(3);
        Node n3 = new Node(7);
        Node n4 = new Node(2);
        Node n5 = new Node(5);
        Node n6 = new Node(1);
        Node n7 = new Node(0);
        Node n8 = new Node(2);
        Node n9 = new Node(8);
        Node n10 = new Node(5);

        n9.setRight(n10);
        n7.setLeft(n8);
        n7.setRight(n9);

        n3.setLeft(n6);
        n3.setRight(n7);

        n2.setLeft(n4);
        n2.setRight(n5);

        n1.setLeft(n2);
        n1.setRight(n3);

        BinaryTree tree = new BinaryTree(n1);

        assertEquals(5, tree.getLeavesCount());
    }

    /// Tests for equals method
    @Test
    public void equalsWithNull() {
        BinaryTree tree = new BinaryTree(null);
        BinaryTree tree1 = new BinaryTree(null);
        assertTrue(tree.equals(tree1));
    }

    @Test
    public void equalsWithOneNode() {
        Node n = new Node(5);
        BinaryTree tree = new BinaryTree(n);
        BinaryTree tree1 = new BinaryTree(n);
        assertTrue(tree.equals(tree1));
    }

    @Test
    public void equalsWithTwoNodes() {
        Node n = new Node(5);
        Node n1 = new Node(6);
        n.setLeft(n1);
        BinaryTree tree = new BinaryTree(n);
        BinaryTree tree1 = new BinaryTree(n);
        assertTrue(tree.equals(tree1));
    }

    @Test
    public void equalsWithDifferentTrees() {
        Node n = new Node(5);
        Node n1 = new Node(6);
        n.setLeft(n1);
        BinaryTree tree = new BinaryTree(n);
        BinaryTree tree1 = new BinaryTree(n1);
        assertFalse(tree.equals(tree1));
    }

    @Test
    public void equalsWithDifferentTrees2() {
        Node n = new Node(5);
        Node n1 = new Node(6);
        n.setLeft(n1);
        BinaryTree tree = new BinaryTree(n);
        BinaryTree tree1 = new BinaryTree(null);
        assertFalse(tree.equals(tree1));
    }

    @Test
    public void largeTreeEquals(){
        Node n1 = new Node(5);
        Node n2 = new Node(3);
        Node n3 = new Node(7);
        Node n4 = new Node(2);
        Node n5 = new Node(5);
        Node n6 = new Node(1);
        Node n7 = new Node(0);
        Node n8 = new Node(2);
        Node n9 = new Node(8);
        Node n10 = new Node(5);

        n9.setRight(n10);
        n7.setLeft(n8);
        n7.setRight(n9);

        n3.setLeft(n6);
        n3.setRight(n7);

        n2.setLeft(n4);
        n2.setRight(n5);

        n1.setLeft(n2);
        n1.setRight(n3);

        BinaryTree tree = new BinaryTree(n1);

        Node n11 = new Node(5);
        Node n12 = new Node(3);
        Node n13 = new Node(7);
        Node n14 = new Node(2);
        Node n15 = new Node(5);
        Node n16 = new Node(1);
        Node n17 = new Node(0);
        Node n18 = new Node(2);
        Node n19 = new Node(8);
        Node n20 = new Node(5);

        n19.setRight(n20);
        n17.setLeft(n18);
        n17.setRight(n19);

        n13.setLeft(n16);
        n13.setRight(n17);

        n12.setLeft(n14);
        n12.setRight(n15);

        n11.setLeft(n12);
        n11.setRight(n13);

        BinaryTree tree1 = new BinaryTree(n11);

        assertTrue(tree.equals(tree1));
    }

}