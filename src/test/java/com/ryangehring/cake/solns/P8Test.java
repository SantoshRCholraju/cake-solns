package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rgehring on 8/25/16.
 */
public class P8Test {
    @Test
    public void testIsBalanced()  {
        P8 p8 = new P8();
        P8.Tree root = p8.new Tree() ;
        assertTrue(root.isBalanced());
    }
    @Test
    public void testIsBalanced2()  {
        P8 p8 = new P8();
        P8.Tree root = p8.new Tree() ;
        root.setLeft(  p8.new Tree()   );
        assertTrue(root.isBalanced());
    }
    @Test
    public void testIsBalanced3()  {
        P8 p8 = new P8();
        P8.Tree root = p8.new Tree() ;
        root.setLeft(  p8.new Tree()   );
        root.getLeft().setLeft(  p8.new Tree()   );
        assertTrue(!root.isBalanced());
    }
    @Test
    public void testIsBalanced4()  {
        P8 p8 = new P8();
        P8.Tree root = p8.new Tree() ;
        root.setLeft(  p8.new Tree()   );
        root.setRight(  p8.new Tree()   );
        root.getLeft().setLeft(  p8.new Tree()   );
        assertTrue(root.isBalanced());
    }
    @Test
    public void testIsBalanced5()  {
        P8 p8 = new P8();
        P8.Tree root = p8.new Tree() ;
        root.setLeft(  p8.new Tree()   );
        root.setRight(  p8.new Tree()   );
        root.getLeft().setLeft(  p8.new Tree()   );
        root.getLeft().setRight(  p8.new Tree()   );
        root.getRight().setRight(  p8.new Tree()   );
        assertTrue(root.isBalanced());
    }




}