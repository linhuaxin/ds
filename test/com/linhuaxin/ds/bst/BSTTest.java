package com.linhuaxin.ds.bst;

import java.util.ArrayList;
import java.util.Random;

public class BSTTest {

    public static void main(String[] args) {

        BST<Integer> bst = new BST<>();
//        int[] nums = {5, 3, 6, 8, 4, 2};
//        for (int num : nums) {
//            bst.add(num);
//        }

//        bst.preOrder();
//        System.out.println();
//
//        bst.preOrderNR();

//        bst.inOrder();
//        System.out.println();
//
//        bst.postOrder();
//        System.out.println();

//        bst.levelOrder();

        Random random = new Random();
        int n = 1000;
        for (int i = 0; i < n; i++) {
            bst.add(random.nextInt(10000));
        }
        ArrayList<Integer> nums = new ArrayList<>();
        while (!bst.isEmpty()) {
            nums.add(bst.removeMax());
        }
        System.out.println(nums);
    }
}
