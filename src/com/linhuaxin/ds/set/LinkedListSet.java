package com.linhuaxin.ds.set;

import com.linhuaxin.ds.linkedList.LinkedList;

public class LinkedListSet<E> implements Set<E> {

    private LinkedList<E> list;

    public LinkedListSet() {
        list = new LinkedList<>();
    }
    @Override
    public void add(E e) {

    }

    @Override
    public void remove(E e) {

    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
