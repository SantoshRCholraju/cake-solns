package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rgehring on 8/25/16.
 */
public class P12Test {
    @Test
    public void test1()  {
        P12 p12 = new P12();
        Integer[] data = {0,1,2,3,4,5,6,7,8,9} ;
        Integer searchIdx = 3 ;
        assertEquals( searchIdx, p12.binSearch(3, data, 0, 9) );
    }

}