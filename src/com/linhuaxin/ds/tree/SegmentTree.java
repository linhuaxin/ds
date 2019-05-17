package com.linhuaxin.ds.tree;

public class SegmentTree<E> {

    private E[] tree;

    private E[] data;

    public SegmentTree(E[] arr) {
        data = (E[])new Object[arr.length];
        for (int i = 0; i < arr.length; i++) {
            data[i] = arr[i];
        }
        tree = (E[])new Object[4 * arr.length];
    }
}
