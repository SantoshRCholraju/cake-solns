package com.ryangehring.cake.solns;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ryan on 8/29/16.
 */
public class P31 {
    // recursive permutations of a string algorithm

    private void perms(String s, String p, List<String> out) {
        if (s.length() == 0) {out.add(p) ; return ;}
        for (int i=0; i< s.length(); i++ ) {
            perms(s.substring(0,i) + s.substring(i+1) , p+s.charAt(i) , out ) ;
        }
    }

    public List<String> allPerms(String s) {
        List<String> out = new LinkedList<>() ;
        perms(s, "", out) ;
        return out ;
    }
}


