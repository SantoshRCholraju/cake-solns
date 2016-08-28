package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/28/16.
 */
public class P20Test {
    @Test
    public void getMax() throws Exception {
        P20 p20 = new P20() ;
        p20.push(3);
        p20.push(1);
        p20.push(7);
        p20.push(7);
        p20.push(4);
        assertEquals(p20.getMax(), 7);
        p20.pop();
        p20.pop();
        assertEquals(p20.getMax(), 7);
        p20.pop();
        assertEquals(p20.getMax(), 3);
    }

}