package com.kunal.staticExample;
//class Test {
    //static String name; Both objects a and b shows rahul , it first set the name to kunal in static variable and modify to rahul

    //public Test(String name) {
        //Test.name = name;
   // }
//}

public class InnerClass { // Outside class cannot be static (static public class Innerclass)
   static class Test { // what is it meaning make the class as static it means it doesnot dependent on making objects of outer class-Innerclass
       String name;

       public Test(String name) {
           this.name = name;
       }
       @Override
       public String toString() {
           return name;
       }

   }


       public static void main(String[] args) {
           Test a = new Test("Kunal");
           Test b = new Test("Rahul");
           System.out.println(a.name);
           System.out.println(b.name); // The main fun and Test are dependent to each other
           System.out.println(a);// Internally it goes to .toString() method , it first checks Test class contains toString() method if it is not it prints some random value
       }
       //NOTE: Static stuff are resolving at compile time
       //      Objects are creating at runtime

   }

