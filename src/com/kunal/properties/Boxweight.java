package com.kunal.properties;

public class Boxweight extends Box{
    double weight;
    Boxweight () {
        this.weight = -1;

    }
    public Boxweight (double l, double w, double h, double weight) {
        super(l,w,h); // what is this? call the parent class constructor
        // used to initialize values present in parent class
        this.weight = weight;
    }

}
