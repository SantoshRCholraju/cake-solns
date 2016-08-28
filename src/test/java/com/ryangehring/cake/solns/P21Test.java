package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/28/16.
 */
public class P21Test {
    @Test
    public void findUnique() throws Exception {
        P21 p21 = new P21() ;
        int[] data = {1,9,2,7,2,1,8,9,7} ;
        assertEquals( (int) p21.findUnique(data), (int) 8) ;
    }

}