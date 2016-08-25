package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rgehring on 8/25/16.
 */
public class P10Test {
    @Test
    public void findSecondLargestInBST() throws Exception {
        P9 p9 = new P9();
        P10 p10 = new P10();
        P9.Tree root = p9.new Tree() ;
        root.setPayload(4);
        root.setLeft(  p9.new Tree()   );
        root.getLeft().setPayload(1);
        root.setRight( p9.new Tree() );
        root.getRight().setPayload(8);

        assertEquals( (Integer) p10.findSecondLargestInBST(  root ) ,  (Integer) 4 );
    }

}