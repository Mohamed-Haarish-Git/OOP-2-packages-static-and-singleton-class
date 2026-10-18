package com.kunal.properties;

public class Main {
   public static void main(String[] args) {
       Box box1 = new Box();
       Box box2 = new Box(box1);
       Box box3 = new Box(4,8);

       Boxweight box4 = new Boxweight(2,4,6,8);
       System.out.println(box4.l+" "+ box4.weight);
    }





}
