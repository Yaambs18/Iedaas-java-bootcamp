package com.JavaBootCamp.ObjectOrientedProgramming.Inheritance;

public class SingleInheritance {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println("Employee with id "+e.id+"get "+e.empSal);
        System.out.println("Manager Salary is : "+e.salary);
    }
}

class Manager{
    int salary = 50000;
}
class Employee extends  Manager{
    int id = 1;
    int empSal = 25000;
}
