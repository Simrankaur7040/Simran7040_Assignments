//1 Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.

class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : " + salary);
        System.out.println("-----------------------------");
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Simran";
        emp1.id = 101;
        emp1.salary = 50000.0;

        Employee emp2 = new Employee();
        emp2.name = "Raj";
        emp2.id = 102;
        emp2.salary = 60000.0;

        emp1.displayDetails();
        emp2.displayDetails();
    }
}
