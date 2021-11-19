package Java.Lab.Lab4;

public class Student{
    private int age;
    private String name,rollNumber;
    double cgpa;
    public Student(int age, String name, String rollNumber, double cgpa) {
        this.age = age;
        this.name = name;
        this.rollNumber = rollNumber;
        this.cgpa = cgpa;
    }
    public Student(Student s){
        this.name = s.name;
        this.age = s.age;
        this.rollNumber = s.rollNumber;
        this.cgpa = s.cgpa;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getRollNumber() {
        return rollNumber;
    }
    public double getCgpa() {
        return cgpa;
    }
    public boolean equalsTo(Student y) {
        return (this.age == y.age && this.name.equals(y.name) && this.rollNumber.equals(y.rollNumber)
                && this.cgpa == y.cgpa);
    }
}
