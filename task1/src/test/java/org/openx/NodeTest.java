package org.openx;


import org.junit.Test;

import static org.junit.Assert.*;


public class NodeTest{

    /// Tests for equals method
    @Test
    public void twoNodesWithoutChildrenSameValue() {
        Node n1 = new Node(5);
        Node n2 = new Node(5);
        assertTrue(n1.equals(n2));
    }
    @Test
    public void twoNodesWithoutChildrenNotSameValue() {
        Node n1 = new Node(5);
        Node n2 = new Node(6);
        assertFalse(n1.equals(n2));
    }

    @Test
    public void sameNumberOfChildrenSamePlaceSameValue() {
        Node n1 = new Node(5);
        Node n2 = new Node(5);
        Node n3 = new Node(5);
        Node n4 = new Node(5);
        n1.setLeft(n2);
        n1.setRight(n3);
        n3.setRight(n4);
        Node n5 = new Node(5);
        Node n6 = new Node(5);
        Node n7 = new Node(5);
        Node n8 = new Node(5);
        n5.setLeft(n6);
        n5.setRight(n7);
        n7.setRight(n8);
        assertTrue(n1.equals(n5));
    }

    @Test
    public void sameNumOfChildrenNotSamePlace(){
        Node n1 = new Node(5);
        Node n2 = new Node(5);
        Node n3 = new Node(5);
        Node n4 = new Node(5);
        n1.setLeft(n2);
        n1.setRight(n3);
        n3.setRight(n4);
        Node n5 = new Node(5);
        Node n6 = new Node(5);
        Node n7 = new Node(5);
        Node n8 = new Node(5);
        n5.setLeft(n6);
        n5.setRight(n7);
        n5.setRight(n8);
        assertFalse(n1.equals(n5));
    }

    @Test
    public void sameNumOfChildrenSamePlaceNotSameValue(){
        Node n1 = new Node(5);
        Node n2 = new Node(5);
        Node n3 = new Node(5);
        Node n4 = new Node(5);
        n1.setLeft(n2);
        n1.setRight(n3);
        n3.setRight(n4);
        Node n5 = new Node(5);
        Node n6 = new Node(5);
        Node n7 = new Node(5);
        Node n8 = new Node(6);
        n5.setLeft(n6);
        n5.setRight(n7);
        n5.setRight(n8);
        assertFalse(n1.equals(n5));
    }

    @Test
    public void sameNumOfChildrenSamePlaceNotSameValue2(){
        Node n1 = new Node(5);
        Node n2 = new Node(5);
        Node n3 = new Node(5);
        Node n4 = new Node(5);
        n1.setLeft(n2);
        n1.setRight(n3);
        n3.setRight(n4);
        Node n5 = new Node(5);
        Node n6 = new Node(5);
        Node n7 = new Node(5);
        Node n8 = new Node(6);
        n5.setLeft(n6);
        n5.setRight(n7);
        n5.setRight(n8);
        assertFalse(n1.equals(n5));
    }

    /// tests for constructors
    @Test
    public void constructorWithOneParam(){
        Node n1 = new Node(5);
        assertEquals(5, n1.getValue());
    }

    @Test
    public void constructorWithZeroParam(){
        Node n1 = new Node();
        assertEquals(0, n1.getValue());
    }

}