package com.ryangehring.cake.solns;

/**
 * Created by rgehring on 8/23/16.
 */
public class P9 {

    public P9() {};

    public class Tree {

        public Tree() {}

        public Boolean isSearchTree() {

            Boolean out = true ;


            if (getLeft() != null) {
                out = out & (getPayload() >= getLeft().getPayload()) ;
            }
            if (getRight() != null) {
                out = out & (getPayload() <= getRight().getPayload()) ;
            }
            if (!out) return false;
            if (getLeft() != null) {
                out = out & getLeft().isSearchTree();
            }
            if (getRight() != null) {
                out = out & getRight().isSearchTree();
            }
            return out;

        }


        private Integer height;


        public Integer getPayload() {
            return payload;
        }

        public void setPayload(Integer payload) {
            this.payload = payload;
        }

        private Integer payload;

        public Tree getLeft() {
            return left;
        }

        public void setLeft(Tree left) {
            this.left = left;
        }

        private Tree left;

        public Tree getRight() {
            return right;
        }

        public void setRight(Tree right) {
            this.right = right;
        }

        private Tree right;


    }
}
