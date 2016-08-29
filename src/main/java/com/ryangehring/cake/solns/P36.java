package com.ryangehring.cake.solns;

/**
 * Created by rgehring on 8/29/16.
 * Single riffle detector
 * Riffle algo:
 * Grab a random number of cards from top half
 * Grab a random number of cards from bottom half
 * Repeat till empty
 * Represent a deck as 1.2...52
 *
 * Naive solution :
 *   - Two indexes initialize in each half
 *   - Order in deck must be either the next card in either half
 *
 */
public class P36 {

    public Boolean isRiffle(Integer[] half1, Integer[] half2, Integer[] deck )  {
        int h1 = 0 ;
        int h2 = 0 ;
        for (int d=0; d<deck.length ; d++) {
            if (h1<half1.length && deck[d].equals(half1[h1] ) ) {
                h1++ ;
                continue;
            }
            if (deck[d].equals(half2[h2] ) ) {
                h2++ ;
                continue;
            }
            return false;
        }
        return true ;
    }

}
