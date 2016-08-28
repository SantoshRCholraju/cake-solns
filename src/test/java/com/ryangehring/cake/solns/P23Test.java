package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/28/16.
 */
public class P23Test {
    @Test
    public void hasCycle() throws Exception {

        P23 p23 = new P23() ;
        P23.LinkedList ll = p23.new LinkedList() ;
        ll.root = ll.new Link() ;
        ll.root.next = ll.new Link() ;
        ll.root.next.next = ll.new Link() ;
        ll.root.next.next.next = ll.new Link() ;
        ll.root.next.next.next.next = ll.root.next ;
        assertTrue(p23.hasCycle( ll ));

    }

}