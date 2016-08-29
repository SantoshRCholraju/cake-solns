package com.ryangehring.cake.solns;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/29/16.
 */
public class P31Test {
    @Test
    public void allPerms() throws Exception {
        P31 p31 = new P31() ;
        String in = "abcd" ;
        List allperms = p31.allPerms(in) ;
        assertEquals(24, allperms.size() );
    }

}