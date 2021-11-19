package Java.Lab.lab11;

import java.util.*;

public class PairClass{
    private static final Scanner input = new Scanner(System.in);
    public static void readDetails(ArrayList<GenericClass<String,Integer>>studentMarks ){
        int n;
        System.out.print("Enter the number of elements :");
        n = input.nextInt();
        for(int  i = 0 ; i < n ; i++){
            String name;
            Integer marks;
            input.nextLine();
            System.out.println("Enter the name :");
            name = input.nextLine();
            System.out.println("Enter marsk :");
            marks = input.nextInt();
            studentMarks.add(new GenericClass<>(name,marks));
        }
    }
    public static void printDetails(ArrayList<GenericClass<String,Integer>>studentMarks){
        System.out.println(studentMarks);
    }
    public static void main(String[] args) {
        ArrayList<GenericClass<String,Integer>>studentMarks = new ArrayList<>();
        readDetails(studentMarks);
        System.out.println("Before Sorting ");
        printDetails(studentMarks);
        studentMarks.sort((a,b) -> {
            if(a.getV() < b.getV())return -1;
            else if(Objects.equals(a.getV(), b.getV())){
               if((a.getU().compareTo(b.getU())) < 0)return -1;
               else return 1;
            }
            else return 1;
        });
        printDetails(studentMarks);
    }
}
