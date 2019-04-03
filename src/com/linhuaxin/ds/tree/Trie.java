package com.linhuaxin.ds.tree;

import java.util.TreeMap;

public class Trie {

    private class Node {

        public boolean isWord;

        public TreeMap<Character, Node> next;

        public Node(boolean isWord) {
            this.isWord = isWord;
            next = new TreeMap<>();
        }
    }

    private Node root;
    private int size;
}
