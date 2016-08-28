package com.ryangehring.cake.solns;

import java.util.Stack;

/**
 * Created by ryan on 8/28/16.
 */
public class P17 {

    private Stack<Integer> s1 ;
    private Stack<Integer> s2 ;


    public P17() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(Integer n) {
        s1.push(n);
    }

    public Integer pop() throws Exception {
        if (s1.empty()) throw new Exception() ;
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        Integer out =  s2.pop();
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
        return out;
    }

}
