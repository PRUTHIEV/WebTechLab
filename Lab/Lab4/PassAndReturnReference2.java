package Java.Lab.Lab4;

import java.util.Arrays;

public class PassAndReturnReference2 {
    public static void main(String[] args) {
        Student st1 = new Student(20,"Pruthiev","2019506067",9.3);
        Student st2 = new Student(20,"Bala","2019506017",9.7);
        Student st3 = new Student(19,"Meyyappan","2019506050",9.5);
        Student st4 = new Student(st1);
        //st4 creates new student object so the reference of st1 and st4 are differently allocated on heap
        Student st5 = st1;
        //st5 now points to st1 and both refer to the same object in the heap
        if(st1 == st4){
            System.out.println("They are same compared by = symbol");
        }
        else System.out.println("They aren't same as they are compared by = symbol");
        if(st1.equalsTo(st4)){
            System.out.println("They are same as they are compared by equalsTo user defined function");
        }
        else System.out.println("They aren't same as they are compared by equalsTo user defined function");
        if(st1 == st5){
            System.out.println("They are same compared by = symbol");
        }
        else System.out.println("They aren't same as they are compared by = symbol");
        if(st1.equalsTo(st5)){
            System.out.println("They are same as they are compared by equalsTo user defined function");
        }
        else System.out.println("They aren't same as they are compared by equalsTo user defined function");
        Integer []p = new Integer[]{1,2,3,4,5};
        Arrays.sort(p);
        System.out.println(Arrays.toString(p));
    }

}
