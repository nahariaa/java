package com.java.chapter_7_inheritance.vehicle;

public class Truck extends Vehicle{
    private int cargocap;

    Truck(int p, int f, int m,  int c) {
        super(p, f, m);
        cargocap = c;
    }

    int getCargoCap() {
        return cargocap;
    }

    void putCargo(int c) {
        cargocap = c;
    }
}
