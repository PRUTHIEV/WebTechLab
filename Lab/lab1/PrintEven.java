package Java.Lab.lab1;

public class PrintEven {
    public static void main(String[] args) {
        System.out.println("The even numbers between 1 and 200 are as follows  :");
        for(int i = 1 ; i <= 200 ; i++){
            if(i % 50 == 0)System.out.println();
            if(i % 2 == 0)System.out.print(i + " ");

        }
    }
}
