package com.mycompany.classexercise2;

//base class
import java.util.Scanner;

class Vehicle
{
    Scanner scan = new Scanner(System.in);
    String model, make;
    int year;
    double horsePower;
    
    
    void start()
    {
        
        System.out.print("Enter the model: ");
        model = scan.nextLine();
     
         System.out.print("Enter the make: ");
         make = scan.nextLine();
        
         System.out.print("Enter the year: ");
         year = scan.nextInt();
         
         System.out.print("\nModel: " + model);
         System.out.print("\nMake: " + make);
         System.out.print("\nYear: " + year);

    }
    
}

class HorsePower extends Vehicle{
    void HP()
    {
        System.out.print("\nEnter the HP"
                + " of the car: ");
        horsePower = scan.nextDouble();
        
        System.out.print("Horse Power: " + horsePower);
    }
    
}

public class c2{
    
    public static void main(String[] args){
        
        
        HorsePower hp = new HorsePower();
        hp.start();
        hp.HP();
    }
    
}
