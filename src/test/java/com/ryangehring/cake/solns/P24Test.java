package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/28/16.
 */
public class P24Test {
    @Test
    public void reverse() throws Exception {

        P24 p24 = new P24() ;
        P24.LinkedList ll = p24.new LinkedList() ;
        ll.root = ll.new Link() ;
        ll.root.payload = 1 ;
        ll.root.next = ll.new Link() ;
        ll.root.next.payload = 2;
        ll.root.next.next = ll.new Link() ;
        ll.root.next.next.payload = 3;

        ll = p24.reverse(ll);
        assertEquals(ll.root.payload, (Integer) 3);
        assertEquals(ll.root.next.next.payload, (Integer) 1);
    }

}