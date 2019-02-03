package com.linhuaxin.ds.array;

public class Student {

    private String name;

    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s, score: %d)", name, score);
    }

    public static void main(String[] args) {
        Array<Student> arr = new Array<>();
        arr.addLast(new Student("A", 100));
        arr.addLast(new Student("B", 60));
        arr.addLast(new Student("C", 73));
        System.out.println(arr);
    }
}
