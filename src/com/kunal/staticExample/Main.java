package com.kunal.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human kunal = new Human(22, "kunal", 10000, false);
//       Human rahul = new Human(43, "rahul", 15000, true);
//       System.out.println(kunal.population);
//       System.out.println(rahul.population);
        Main funn = new Main();
        funn.fun2();

    }
    static void fun(){
        //greeting();you cannot access this because it requires an instanace
        //  but the function you are using it does not depend on instances...


        // you cannot access non-static stuff without referencing their instances in a static context
        //Hence,Here I am referencing it
        Main obj = new Main();
       obj.greeting();
    }

    void greeting(){
        fun();
        System.out.println("This is greeting");
    }
    void fun2(){
        greeting();
    }

}
