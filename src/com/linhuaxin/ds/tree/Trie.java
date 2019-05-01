package com.linhuaxin.ds.tree;

import java.util.TreeMap;

public class Trie {

    private class Node {

        public Node() {}

        public boolean isWord;

        public TreeMap<Character, Node> next;

        public Node(boolean isWord) {
            this.isWord = isWord;
            next = new TreeMap<>();
        }
    }

    private Node root;
    private int size;

    public void add(String word) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.next.get(c) == null) {
                cur.next.put(c, new Node());
                cur = cur.next.get(c);
            }
        }

        if (!cur.isWord) {
            cur.isWord = true;
            size++;
        }
    }
}
