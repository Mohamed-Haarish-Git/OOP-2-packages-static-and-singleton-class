package com.kunal.properties;

public class Box {
    double l;
    double w;
    double h;

    Box () {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box (double side) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box (double l, double w) {
        this.l = l;
        this.w = w;
    }
    Box (double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box (Box old) {
        this.l = l;
        this.w = w;
        this.h = h;

    }
    public void message(){
        System.out.println("Inherit the data");
    }


}
