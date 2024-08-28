/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classexercise2;
import java.util.Scanner;

class Person
{
    String name, address, telephone;
    
    Person(String newName, String newAddress, String newTelephone)
    {
        name = newName;
        address = newAddress;
        telephone = newTelephone;
    }
    
    void setName(String newName)
    {
        name = newName;
    }
    
    void setAddress(String newAddress)
    {
        address = newAddress;
    }
    
    void setTelephone(String newTelephone)
    {
        telephone = newTelephone;
    }
    
    String getName(String newName)
    {
        return name;
    }
    
    String getAddress(String newAddress)
    {
        return address;
    }
    
    String getTelephone(String newTelephone)
    {
        return telephone;
    }
    
    public String toString()
    {
        return "\n\nPerson: " + name + "\nAddress: " + address + "\nTelephone: " + telephone;
    }
}

class Customer extends Person
{
    String mail;
    boolean mailFlag;
    int customerNumber;
    String mailYesorNo;
    
    Scanner scan = new Scanner(System.in);
    
    Customer(String newName, String newAddress, String newTelephone, int number)
    {
        super(newName, newAddress, newTelephone);
        customerNumber = number;
    }
    
    void mailingList()
    {
        System.out.print("Do you wish to be on the mailing list? (y/n): ");
        mail = scan.nextLine();
        
        if(mail.equals("y") || mail.equals("Y"))
        {
            mailFlag = true;
            mailYesorNo = "Yes";
        }
        else
        {
            mailFlag = false;
            mailYesorNo = "No";
        }
    }
    
    public String toString()
    {
        return "\n\nPerson: " + name + "\nAddress: " + address + "\nTelephone: " + telephone + "\nMailing Status: " + mailYesorNo + "\nCustomer Number: " + customerNumber;
    }
}


public class Project1 {
    
    public static void main(String[] args)
    {
        Customer bob = new Customer("Bob", "123 Elm Street", "888-456-7890", 12345);
        System.out.println("Now showing mailing list");
        bob.mailingList();
                
        System.out.println("\n\n");

        System.out.println(bob);
        
        System.out.println("\n\n");
        System.out.println("Now changing Bob");
        
        bob.setName("Tim");
        bob.setAddress("456 Wolf Street");
        bob.setTelephone("800-789-123");
        System.out.println(bob);
        
    }
    
}
