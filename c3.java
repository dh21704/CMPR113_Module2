
package com.mycompany.classexercise2;
import java.util.Scanner;

class Employees {
    String name;
    double salary;
    Scanner scan = new Scanner(System.in);
    
    //constructor that inits the variables are initialized
    //pass parameters
    Employees(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
        
        System.out.print("\nEnter the emp name: ");
        name = scan.nextLine();
        
        System.out.print("\nEnter the emp salary: ");
        salary = scan.nextDouble();
        
        scan.nextLine();
    }  
    
    void displayEmp()
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        
    }
}

//derived class
//parameters in parents class matches derived class
class Manager extends Employees
{
    String department, managerName;
    
    Manager(String name, double salary, String dept, String SuperVisor)
    {
        //automatically call the super class
        super(name, salary);
        this.department = dept;
        this.managerName = SuperVisor;
        
        System.out.print("Enter the department: ");
        department = scan.nextLine();
        
        System.out.print("Enter the super name: ");
        managerName = scan.nextLine();
    }
    
    void displayManager()
    {
        super.displayEmp();
        System.out.println("Dept: " + department);
        System.out.print("Super name is: " + managerName);
    }
          
}

public class c3
{
    public static void main(String[] args)
    {                       //pass 3 arguments
        Manager employee1 = new Manager("", 200000, "Information Tech", "Jane Doe");
        employee1.displayManager();
        
        System.out.println("\n\n");
        
        Manager employee2 = new Manager("Bill Doe", 300000, "Finance", "Jane Doe");
        employee2.displayManager();
    }
}
