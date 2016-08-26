package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rgehring on 8/26/16.
 */
public class P15Test {
    @Test
    public void fib() throws Exception {
        P15 p15 = new P15() ;
        assertEquals(p15.fib(1) , (Integer) 1);
    }
    @Test
    public void fib2() throws Exception {
        P15 p15 = new P15() ;
        assertEquals(p15.fib(6) , (Integer) 13);
    }

}