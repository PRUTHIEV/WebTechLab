package Java.Lab.lab3;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private String name,rollNumber,gender;
    int age;
    public Student(String name, String rollNumber, String gender, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.gender = gender;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getRollNumber() {
        return rollNumber;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
}
class Result extends Student{
    private double cgpa;
    ArrayList<Integer>marks;
    Result(String name,String rollNumber,String gender,int age,ArrayList<Integer>marks){
        super(name,rollNumber,gender,age);
        this.marks = marks;
    }
    void calculateCGPA(){
        cgpa = marks.stream().mapToInt(x -> x).average().orElse(-1);
    }
    @Override
    public String toString() {
        return getName() + " " + getRollNumber() + " " + getAge() + " " + getGender() + " " + marks.toString() + " " + cgpa;
    }
}
public class SingleLevelInheritance {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        String name,rollNumber,gender;
        int age;
        System.out.print("Enter the number of students :");
        n = input.nextInt();
        ArrayList<Result>students = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            input.nextLine();
            System.out.print("Enter name :");
            name = input.nextLine();
            System.out.print("Enter roll number , gender , age :");
            rollNumber = input.next();
            gender = input.next();
            age = input.nextInt();
            int numMarks;
            System.out.print("Enter the number of subjects :");
            numMarks = input.nextInt();
            System.out.print("Enter marks :");
            ArrayList<Integer>marks = new ArrayList<>();
            for(int j = 0 ; j < numMarks ; j++){
                int m = input.nextInt();
                marks.add(m);
            }
            students.add(new Result(name,rollNumber,gender,age,marks));
            students.get(i).calculateCGPA();
        }
        for(int i = 0 ; i < n ; i++){
            System.out.println(students.get(i));
        }
    }
}
