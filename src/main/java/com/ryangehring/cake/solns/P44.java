package com.ryangehring.cake.solns;

/**
 * Created by rgehring on 8/30/16.
 */
public class P44 {
    // url shortener
    // okay its going to take a url, hash it into a 'short' and available form, then store in a database.
    // i dont really want to do a lot of implementation for this. could just assign random characters
    // to a certain length then stick in a db.

    public String shortener(String urlComponent) {
        // silly numeric hash function --- this would only assign numeric short urls ie shortlyshort.com/123
        // also assumes we have some fallback in place in case of collision.
        char[] chars = urlComponent.toCharArray() ;
        int sum = 0 ;
        for (char c : chars) {
            sum += c ;
        }
        return Integer.toString(sum);
    }

}
