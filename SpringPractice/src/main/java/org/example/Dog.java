package org.example;

public class Dog {
    int ears;
    int tail;
    String furColor;
    String pawColor;
    String name;

    public Dog(int ears, int tail, String furColor, String pawColor, String name){
        this.ears = ears;
        this.tail = tail;
        this.furColor= furColor;
        this.pawColor=pawColor;
        this.name= name;

    }

    static void bark(){
        System.out.println("Woof");
    }
    static void pee(){
        System.out.println("piss");
    }
    static void begForFood(){
        System.out.println("Woof woof with puppy dog eyes");
    }
}
