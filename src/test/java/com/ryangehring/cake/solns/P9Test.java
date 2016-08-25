package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rgehring on 8/25/16.
 */
public class P9Test {
    @Test
    public void testIsBalanced1()  {
        P9 p9 = new P9();
        P9.Tree root = p9.new Tree() ;
        root.setPayload(4);
        assertTrue(root.isSearchTree());
    }

    @Test
    public void testIsBalanced2()  {
        P9 p9 = new P9();
        P9.Tree root = p9.new Tree() ;
        root.setPayload(4);
        root.setLeft(  p9.new Tree()   );
        root.getLeft().setPayload(1);
        assertTrue(root.isSearchTree());
    }

    @Test
    public void testIsBalanced3()  {
        P9 p9 = new P9();
        P9.Tree root = p9.new Tree() ;
        root.setPayload(4);
        root.setLeft(  p9.new Tree()   );
        root.getLeft().setPayload(5);
        assertTrue(!root.isSearchTree());
    }

    @Test
    public void testIsBalanced4()  {
        P9 p9 = new P9();
        P9.Tree root = p9.new Tree() ;
        root.setPayload(4);
        root.setLeft(  p9.new Tree()   );
        root.getLeft().setPayload(1);
        root.getLeft().setLeft(  p9.new Tree()   );
        root.getLeft().getLeft().setPayload(0);
        root.getLeft().setRight(  p9.new Tree()   );
        root.getLeft().getRight().setPayload(2);
        assertTrue(root.isSearchTree());
    }

    @Test
    public void testIsBalanced5()  {
        P9 p9 = new P9();
        P9.Tree root = p9.new Tree() ;
        root.setPayload(4);
        root.setLeft(  p9.new Tree()   );
        root.getLeft().setPayload(1);
        root.getLeft().setLeft(  p9.new Tree()   );
        root.getLeft().getLeft().setPayload(0);
        root.getLeft().setRight(  p9.new Tree()   );
        root.getLeft().getRight().setPayload(0);
        assertTrue(!root.isSearchTree());
    }






}