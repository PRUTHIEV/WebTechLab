package Java.Lab.lab2;
import java.util.*;
class Student{
	private String name,rollNumber;
	int curSem,age;
	double cgpa;
	public Student(String name, String rollNumber, int curSem, int age, double cgpa) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.curSem = curSem;
		this.age = age;
		this.cgpa = cgpa;
	}
	public String getName() {
		return name;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public int getCurSem() {
		return curSem;
	}
	public int getAge() {
		return age;
	}
	public boolean isNull(){
		return false;
	}
	public double getCgpa() {
		return cgpa;
	}
	@Override
	public String toString() {
		return name + " " + rollNumber + " " + age + " " + cgpa + " " + curSem;
	}
	}
public class ListArray {
	private static Scanner input = new Scanner(System.in);
	public static void add(ArrayList<Student>students){
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
		students.add(new Student(name,rollNumber,curSem,age,cgpa));
	}
	public static void remove(ArrayList<Student>students){
		input.nextLine();
		String name;
		System.out.print("Enter student name :");
		name = input.nextLine();
		if(students.removeIf(x -> x.getName().equals(name)))System.out.println("Student name removed successfully");
		else System.out.println("Student name not exists");
	}
	public static void search(ArrayList<Student>students){
		input.nextLine();
		String name;
		System.out.print("Enter student name :");
		name = input.nextLine();
		if((students.stream().filter(x -> x.getName().equals(name)).findAny().orElse(null) != null)){
			System.out.println("Student exists");
		}
		else System.out.println("Student details not exists");
	}
	public static Student findMaxCGPA(ArrayList<Student>students){
		double maxCgpa = students.stream().mapToDouble(Student::getCgpa).max().orElse(-1);
		return students.stream().filter(x -> x.getCgpa() == maxCgpa).findAny().orElse(null);
	}
	public static Student findMinCGPA(ArrayList<Student>students){
		double maxCgpa = students.stream().mapToDouble(Student::getCgpa).min().orElse(-1);
		return students.stream().filter(x -> x.getCgpa() == maxCgpa).findAny().orElse(null);
	}
	public static void sortByName(ArrayList<Student>students){
		students.sort(Comparator.comparing(Student::getName));
	}
	public static void sortByCGPA(ArrayList<Student>students){
		students.sort(Comparator.comparing(Student :: getCgpa).reversed());
	}
	public static void main(String[] args) {
		ArrayList<Student>students = new ArrayList<>();
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
						System.out.println(st);
					}
				}
				case 5 -> {
					Student st1 = findMinCGPA(students);
					if (st1 != null) {
						System.out.println(st1);
					}
				}
				case 6 -> {
					sortByName(students);
					System.out.println(students);
				}
				case 7 -> {
					sortByCGPA(students);
					System.out.println(students);
				}
				case 8 -> {
					System.out.println(students);
				}
				default -> System.out.println("Enter a valid choice !!!");
			}
		}while(choice >= 0);
	}
}
