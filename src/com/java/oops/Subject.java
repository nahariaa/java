package com.java.oops;

public class Subject {
    private String name;
    private int id;
    private int maxMarks;
    private int minMarks;

    public Subject(String name, int id) {
        this.name = name;
        this.id = id;
        maxMarks = 100;
        minMarks = 40;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setMaxMarks(int maxMarks){
        this.maxMarks = maxMarks;
    }

    public int getMaxMarks() {
        return this.maxMarks;
    }

    public void setMinMarks(int minMarks) {
        this.minMarks = minMarks;
    }

    public int getMinMarks() {
        return this.minMarks;
    }

    public static void main(String[] args) {
        Subject subs[] = new Subject[2];
        subs[0] = new Subject("Maths", 22);
        subs[1] = new Subject("Physics", 34);
    }
}
