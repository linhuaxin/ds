package com.linhuaxin.ds.set;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListSetTest {

    public static void main(String[] args) {
        System.out.println("Pride and Prejudice");
        ArrayList<String> words1 = new ArrayList<>();
        FileOperation.readFile("pride-and-prejudice.txt", words1);
        System.out.println("Total words: " + words1.size());

        LinkedListSet<String> set1 = new LinkedListSet<>();
        for (String word: words1) {
            set1.add(word);
        }
        System.out.println("Total different words: " + set1.getSize());

        System.out.println("A Table of Two Cities");
        ArrayList<String> words2 = new ArrayList<>();
        FileOperation.readFile("a-tale-of-two-cities.txt", words2);
        System.out.println("Total words: " + words2.size());

        LinkedListSet<String> set2 = new LinkedListSet<>();
        for (String word: words2) {
            set2.add(word);
        }
        System.out.println("Total different words: " + set2.getSize());
    }
}
