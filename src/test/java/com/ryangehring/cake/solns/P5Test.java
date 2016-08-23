package com.ryangehring.cake.solns;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream ;

/**
 * Created by rgehring on 8/23/16.
 */
public class P5Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }
    @Test
    public void printWaysToMakeChange() throws Exception {
        P5 p5 = new P5();
        p5.printWaysToMakeChange(3,"",true,true,true);
        assertEquals("PPP\n", outContent.toString());
    }

}