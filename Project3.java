
package com.mycompany.classexercise2;

import java.util.Scanner;

class c8
{
    String name;
    double pay;
    double hours;
    double total;
    
    Scanner scan = new Scanner(System.in);
    
    //mutator to set the variables from top
    public void setAskQuestions()
    {
        System.out.print("Enter the name: ");
        name = scan.nextLine();
        
        System.out.print("Enter the hourly pay: ");
        pay = scan.nextDouble();
        
        System.out.print("Enter the hours worked: ");
        hours = scan.nextDouble();
    }
    
    //access method to get variable, always have to include the data type
    //passing n to name and returning n, which is the name
    public String getName(String n)
    {
        n = name;
        return n;
    }
    
    //accessor method
    public double getPay(double p)
    {
        p = pay;
        return p;
    }
    
    public double getHours(double h)
    {
        h = hours;
        return h;
    }
    
    public double getTotal(double p, double h)
    {
        total = p * h;
        return total;
    }
}

public class Project3 {
    public static void main(String[] args)
    {
        c8 obj = new c8(); // call c8 class
        
        obj.setAskQuestions();
        
        String name = obj.getName(""); // set one place holder
        double pay = obj.getPay(0);
        double hours = obj.getHours(0);
        double total = obj.getTotal(pay, hours); // set two place holders
        
        if (hours > 40)
        {
            double tenPercent = 0.10 * total;
            System.out.println();
            total = tenPercent + total;
        }
        
        System.out.println("the name is " + name);
        System.out.println("the hourly pay is $" + pay);
        System.out.println("the hours worked is " + hours);
        System.out.println("the total pay is $" + total);
        
        
    }
}
