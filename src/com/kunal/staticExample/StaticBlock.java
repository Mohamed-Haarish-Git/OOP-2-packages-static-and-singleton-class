package com.kunal.staticExample;

public class StaticBlock {
    //this a demo to show intialization of static variables
    static int a = 5;
    static int b;
    //will run only once, when the first object is create i.e, when the class is loaded for first time
    static{
        System.out.println("I am in static block");
        b = a * 4;
    }

   public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
       System.out.println(StaticBlock.a +" "+ StaticBlock.b);

       StaticBlock.b += 2;
       System.out.println(StaticBlock.a +" "+ StaticBlock.b);

       StaticBlock obj2 = new StaticBlock();
       System.out.println(StaticBlock.a +" "+ StaticBlock.b);
    }
}
