package org.example;

import org.springframework.stereotype.Component;

@Component
public class Human {
    String name;
    int age;
    Dog dog;


    public Human (String name, int age, Dog dog){
        this.name = name;
        this.age= age;
        this.dog=dog;
    }

    public void MentionHuman(){
        System.out.println("Hi, my name is: " + name+ " and my dog's name is " + dog.name);
    }

}
