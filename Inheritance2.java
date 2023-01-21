// Create a class named 'Member' having the following members:
//     Data members
//     1 - Name
//     2 - Age
//     3 - Phone number
//     4 - Address
//     5 - Salary
//     It also has a method named 'printSalary' which prints the salary of the members.
//     Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 
//     'Manager' classes have data members 'specialization' and 'department' respectively. 
//     Now, assign name, age, phone number, address and salary to an employee and a manager by 
//     making an object of both of these classes and print the same.

import java.util.Scanner;
class Member{
    String name, address;
    int age, salary;
    long number;


    void printSalary()
    {
        System.out.println("Salary" + salary);
    }
}

class Employee extends Member{
    String specialization;
}

class Manager extends Member{
    String department;
}

public class Inheritance2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Employee obj = new Employee();

        System.out.println("Enter name: ");
        obj.name = scr.next();
        System.out.println("Enter age: ");
        obj.age = scr.nextInt();
        System.out.println("Enter salary: ");
        obj.salary = scr.nextInt();
        System.out.println("Enter number: ");
        obj.number = scr.nextLong();
        scr.nextLine();
        System.out.println("Enter address: ");
        obj.address = scr.nextLine();

        obj.printSalary();


        Manager obj2 = new Manager();

        System.out.println("Enter name: ");
        obj2.name = scr.next();
        System.out.println("Enter age: ");
        obj2.age = scr.nextInt();
        System.out.println("Enter salary: ");
        obj2.salary = scr.nextInt();
        System.out.println("Enter number: ");
        obj2.number = scr.nextLong();
        scr.nextLine();
        System.out.println("Enter address: ");
        obj2.address = scr.nextLine();

        obj2.printSalary();
    }
}
