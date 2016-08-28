package com.ryangehring.cake.solns;

/**
 * Created by ryan on 8/28/16.
 * reverse a ll
 */

public class P24 {



    class LinkedList {
        public Link root;
        public class Link {
            public Link next ;
            public Integer payload ;
            public Link() {
                next = null ;
            }
        }
    }

    public P24.LinkedList reverse(P24.LinkedList ll) {
        LinkedList.Link curr = ll.root ;
        LinkedList.Link next = ll.root.next ;
        LinkedList.Link temp = null ;
        while (next != null) {
            temp = next.next ;
            next.next = curr ;
            curr = next ;
            next = temp ;
        }
        ll.root = curr ;
        return ll;
    }

}
