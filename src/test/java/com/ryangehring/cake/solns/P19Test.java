package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/28/16.
 */
public class P19Test {
    @Test
    public void pop() throws Exception {
        P19 p17 = new P19() ;
        p17.push(1);
        p17.push(2);
        p17.push(3);
        assertEquals(p17.pop(), (Integer) 1);
    }

}