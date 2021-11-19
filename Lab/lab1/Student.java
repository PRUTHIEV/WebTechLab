package Java.Lab.lab1;

import java.util.Scanner;

class StudentDetails{
    private final static Scanner input = new Scanner(System.in);
    private int age;
    private String name,phoneNumber,rollNumber;
    private int []marks;
    private int numberOfSubjects;
    private double cgpa;
    StudentDetails(int age, String name, String phoneNumber, String rollNumber,int numberOfSubjects ) {
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.rollNumber = rollNumber;
        this.numberOfSubjects = numberOfSubjects;
        marks = new int[numberOfSubjects];
        System.out.print("Enter subject marks :");
        for(int i = 0 ; i < numberOfSubjects ; i++){
            marks[i] = input.nextInt();
        }
        input.nextLine();
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getRollNumber() {
        return rollNumber;
    }
    public double getCgpa() {
        return cgpa;
    }
    void  calculateCGPA(){
        double total = 0d;
        for(int i = 0 ; i < marks.length ; i++)total += marks[i];
        cgpa =  total / (double)numberOfSubjects;
    }
}
public class Student {
    private final static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        int age;
        String name,phoneNumber,rollNumber;
        int numberOfSubjects;
        System.out.print("Enter the number of students :");
        n = input.nextInt();;
        StudentDetails [] students = new StudentDetails[n];
        for(int i = 0 ; i < n ; i++){
            input.nextLine();
            System.out.print("Enter the name : ");
            name = input.nextLine();
            System.out.print("Enter the age :");
            age = input.nextInt();
            input.nextLine();
            System.out.print("Enter the phone Number :");
            phoneNumber = input.nextLine();
            System.out.print("Enter the roll number :");
            rollNumber = input.nextLine();
            System.out.print("Enter the number of subjects :");
            numberOfSubjects = input.nextInt();
            students[i] = new StudentDetails(age,name,phoneNumber,rollNumber,numberOfSubjects);
            students[i].calculateCGPA();
        }
        for(int i = 0 ; i < n ; i++){
            System.out.println("The name is :" + students[i].getName());
            System.out.println("The age is :" + students[i].getAge());
            System.out.println("The roll number is :" + students[i].getRollNumber());
            System.out.println("The phone number is :" + students[i].getPhoneNumber());
            System.out.println("The CGPA is : " + students[i].getCgpa());
        }
    }
}
