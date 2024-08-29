

package com.mycompany.cmpr113_hw2;

class Employee
{
    String name;
    int number;
    char letter;
    String hireDate;
    
    Employee(String name, int number, char letter, String hireDate)
    {
        this.name = name;
        this.number = number;
        this.letter = letter;
        this.hireDate = hireDate;
    }
    
    void setName(String name)
    {
        this.name = name;
    }
    
    void setNumber(int number)
    {
        this.number = number;
    }
    
    void setLetter(char letter)
    {
        this.letter = letter;
    }
    
    void setHireDate(String hireDate)
    {
        this.hireDate = hireDate;
    }
    
    String getName()
    {
        return name;
    }
    
    int getNumber()
    {
        return number;
    }
    
    char getLetter()
    {
        return letter;
    }
    
    String getHireDate()
    {
        return hireDate;
    }
    
    public String toString()
    {
        return "\nName: " + name +
                "\nEmployee Number: " + number + "-" + letter +
                "\nHire Date: " + hireDate;         
    }
 
}

class ProductionWorker extends Employee
{
    int shift;
    String typeShift;
    double hourlyPay;
    
    ProductionWorker(String name, int number, char letter, String hireDate, int shift, double hourlyPay)
    {
        super(name, number, letter, hireDate);
        this.shift = shift;
        this.hourlyPay = hourlyPay;
        
        if (shift == 1)
        {
            typeShift = "Day";
        }
        else
        {
            typeShift = "Night";
        }
    }
    
    void setShift(int shift)
    {
        this.shift = shift;
        
        if (shift == 1)
        {
            typeShift = "Day";
        }
        else
        {
            typeShift = "Night";
        }
    }
    
    int getShift()
    {
        return shift;
    }
    
    void setHourlyPay(double hourlyPay)
    {
        this.hourlyPay = hourlyPay;
    }
    
    double getHourlyPay()
    {
        return hourlyPay;
    }
    
    
    public String toString()
    {
        return "\nName: " + name +
                "\nEmployee Number: " + number + "-" + letter +
                "\nHire Date: " + hireDate +
                "\nType of Shift: " + typeShift +
                "\nHourly Pay Rate: " + hourlyPay;
    }
}

public class CMPR113_HW2_Project1 {

    public static void main(String[] args) {
        Employee bob = new Employee("Bob", 123, 'B', "08-29-2024");
        System.out.println(bob);
        
        System.out.println("\nNow Changing Bob To Charlie");
        
        bob.setName("Charlie");
        bob.setNumber(789);
        bob.setLetter('C');
        bob.setHireDate("08-31-2024");
        
        System.out.println("\nHere's Charlie");
        System.out.println(bob);
        
        ProductionWorker tim = new ProductionWorker("Tim", 456, 'T', "08-30-2024", 1, 30);
        System.out.println(tim);
        
        System.out.println("\nNow Changing Tim To Zoey");
        
        tim.setName("Zoey");
        tim.setNumber(567);
        tim.setLetter('Z');
        tim.setHireDate("09-01-2024");
        tim.setHourlyPay(40);
        tim.setShift(2);
        
        System.out.println("\nHere's Zoey");
        System.out.println(tim);

    }
}
