package com.ryangehring.cake.solns;

/**
 * Created by rgehring on 8/23/16.
 */
public class P8 {

    public P8() {};

    public class Tree {

        public Tree() {}

        public Boolean isBalanced() {

            // true if for every node in left and every node in right the left and right subtree height differs by 1
            // recursively traverse the tree in (visit left subtree, visit right subtree, visit root) fashion recording heights
            // at the 'root' step compare if height is differ by one
            // return false if so

            if (getHeight() == 1) return true;
            Integer lh = 0;
            Integer rh = 0;
            if (getLeft() != null) {
                lh = getLeft().getHeight();
            }
            if (getRight() != null) {
                rh = getRight().getHeight();
            }

            Integer depthDiff = Math.abs(lh - rh) ;
            Boolean nodeBalanced =  depthDiff <= 1 ;
            if ( !nodeBalanced) return false ;
            Boolean out = true ;
            if (getLeft() != null) {
                out = out & getLeft().isBalanced();
            }
            if (getRight() != null) {
                out = out & getRight().isBalanced();
            }
            return out ;

        }

        public Integer getHeight() {
            if (this.height != null) {
                return this.height;
            }
            Integer lh = 0;
            Integer rh = 0;
            if (getLeft() != null) {
                lh = getLeft().getHeight();
            }
            if (getRight() != null) {
                rh = getRight().getHeight();
            }
            this.height = 1 + Math.max(lh, rh);
            return this.height ;

        }

        private Integer height;


        public String getPayload() {
            return payload;
        }

        public void setPayload(String payload) {
            this.payload = payload;
        }

        private String payload;

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
