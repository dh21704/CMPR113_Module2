package com.mycompany.classexercise2;

//base class

import java.util.Scanner;

 class animal {
    
    String name, play;
    int age;
    
    void eat(){
        System.out.println(name + " is eating "
                + " his favorite treat ");
    }
    
    void play(){
      Scanner scan = new Scanner (System.in);
      
        System.out.println("What does the animal"
                + " like to play with?");
        play = scan.nextLine();
        
        
    }
}
   //derived class 1 is a class
//that extends to a base class
class Dog extends animal{
    
    void bark(){
        System.out.println(name + " is barking ");
        System.out.println("the age of the dog is "
                + age);
        
        System.out.println(name + " likes to play " +
                play);
    }
    
}
class Cat extends Dog{
    
    void meow(){
        System.out.println(name + " is meowing ");
        System.out.println("the age of the cat is "
                + age);
        
        System.out.println(name + " likes to play " +
                play);
    }
}
//main class
public class c1{
    public static void main(String[] args) {
        
        //Object 1
        Dog dogs = new Dog();
        dogs.name = "Cooper";
        dogs.age = 2;
        
        dogs.bark();
        dogs.eat();
        dogs.play();
        
        System.out.println("\n\n");
        //Object 2
        Cat cats = new Cat();
        cats.name = "Ivan the Cat";
        cats.age = 5;
        cats.play();
        cats.meow();
       
     
    }
}
