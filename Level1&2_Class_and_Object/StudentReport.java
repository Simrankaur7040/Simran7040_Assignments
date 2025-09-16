// 1 Problem Statement: Create a Student class with attributes name, rollNumber, and marks. Add two methods:
// calculate the grade based on the marks.
// display the student's details and grade.


class Student {
    String name;
    int rollNumber;
    int marks;

    String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 75) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    void displayDetails() {
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
        System.out.println("-----------------------------");
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Riya Sharma";
        s1.rollNumber = 101;
        s1.marks = 88;

        Student s2 = new Student();
        s2.name = "Aman Verma";
        s2.rollNumber = 102;
        s2.marks = 46;

        s1.displayDetails();
        s2.displayDetails();
    }
}
