package com.ryangehring.cake.solns;

/**
 * Check if any permutation of a string is a palindrome.
 */
public class P30 {
    // easy way - hash table.
    // xor way - xor 0 with every digit sequentially. you should have 0. i think this only works for even palindromes.

    public boolean isEvenPal(String s) {

        int x = 0 ;

        for (int i=0; i< s.length() ; i++) {
            x = x ^ s.charAt(i) ;
        }
        if (x==0) return true ;
        return false;

    }

}
