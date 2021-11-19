package Java.Lab.Lab4;
import java.util.*;


public class PassAndReturnReference1 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of students :");
        n = input.nextInt();
        ArrayList<Student>students = new ArrayList<>(n);
        int age;
        String name,rollNumber;
        double cgpa;
        for(int i = 0 ; i < n ; i++){
            input.nextLine();
            System.out.print("Enter the name of the student :");
            name = input.nextLine();
            System.out.print("Enter the age and roll number :");
            age = input.nextInt();
            rollNumber = input.next();
            System.out.print("Enter the cgpa :");
            cgpa = input.nextDouble();
            students.add(new Student(age,name,rollNumber,cgpa));
        }
        input.nextLine();
        System.out.print("Enter the name or the student to be searched for :");
        name = input.nextLine();
        System.out.print("Enter the age and roll number to be searched for : ");
        age = input.nextInt();
        rollNumber = input.next();
        System.out.print("Enter the cgpa to be searched for : ");
        cgpa = input.nextDouble();
        Student find = new Student(age,name,rollNumber,cgpa);
        Student found = students.stream().filter((x) -> x.equalsTo(find)).findFirst().orElse(null);
        if(found != null){
            System.out.print("The student is present at index " + students.indexOf(found));
        }
    }
}
