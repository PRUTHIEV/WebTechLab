package Java.Lab.lab2;

import java.util.*;

public class Array {
    private static Scanner input = new Scanner(System.in);
    static int count = 0;
    public static void add(Student[]students){
        int age,curSem;
        String name,rollNumber;
        double cgpa;
        input.nextLine();
        System.out.print("Enter name :");
        name = input.nextLine();
        System.out.print("Enter roll number :");
        rollNumber = input.nextLine();
        System.out.print("Enter age , current Semester, and cgpa :");
        age = input.nextInt();
        curSem = input.nextInt();
        cgpa = input.nextDouble();
        if(count >= students.length)System.out.println("Array is full ");
        else students[count++] = new Student(name,rollNumber,curSem,age,cgpa);
    }
    public static void remove(Student[]students){
        input.nextLine();
        String name;
        System.out.print("Enter student name :");
        name = input.nextLine();
        int index = -1;
        for(int i = 0 ; i < students.length ; i++){
            if(students[i].getName().equals(name)){
                index = i;
                break;
            }
        }
        if(index != -1){
            for(int i = index ; i < students.length-1 ; i++){
                students[i] = students[i+1];
            }
            students[count-1] = null;
            count --;
            System.out.println("The student details are removed successfully");
        }
        else{
            System.out.println("Student does not exists");
        }

    }
    public static void search(Student[]students){
        input.nextLine();
        String name;
        System.out.print("Enter student name :");
        name = input.nextLine();
        Student findStudent = Arrays.stream(students).filter(x -> (x.getName().equals(name))).findAny().orElse(null);
        if(findStudent != null)System.out.println("The student detail exists");
        else System.out.println("The student details does not exists");
    }
    public static Student findMaxCGPA(Student[]students){
        return Arrays.stream(students).max(Comparator.comparing(Student :: getCgpa)).orElse(null);
    }
    public static Student findMinCGPA(Student[]students){
        return Arrays.stream(students).min(Comparator.comparing(Student :: getCgpa)).orElse(null);
    }
    public static void sortByName(Student[]students){
        Arrays.sort(students,Comparator.nullsLast(Comparator.comparing(Student ::getName)));
    }
    public static void sortByCGPA(Student[]students){
        Arrays.sort(students,Comparator.nullsLast(Comparator.comparing(Student ::getCgpa).reversed()));
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of students :");
        n = input.nextInt();
        Student[]students = new Student[n];
        int choice;
        System.out.println("The choice are :");
        System.out.println("1 --> Add Student\n2 --> Remove Student\n3 --> Search a Student\n4 --> Find Student with max CGPA" +
                    "\n5 --> Find Student with min CGPA\n6 --> Sort Students by name\n7 --> Sort students by CGPA\n8 --> Display Details\n");
        do {
            System.out.print("Enter the choice :");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> add(students);
                case 2 -> remove(students);
                case 3 -> search(students);
                case 4 -> {
                    Student st = findMaxCGPA(students);
                    if (st != null) {
                        System.out.println(st.toString());
                    }
                }
                case 5 -> {
                    Student st1 = findMinCGPA(students);
                    if (st1 != null) {
                        System.out.println(st1.toString());
                    }
                }
                case 6 -> {
                    sortByName(students);
                    Arrays.stream(students).filter(Objects::nonNull).forEach((x) -> System.out.print(x.toString() + " , "));
                    System.out.println();
                }
                case 7 -> {
                    sortByCGPA(students);
                    Arrays.stream(students).filter(Objects::nonNull).forEach((x) -> System.out.print (x.toString() + " , "));
                    System.out.println();
                }
                case 8 -> {
                    Arrays.stream(students).filter(Objects::nonNull).forEach((x) -> System.out.print(x.toString() + "  , "));
                    System.out.println();
                }
                default -> System.out.println("Enter a valid choice !!!");
            }
        }while(choice >= 0);
    }

}

