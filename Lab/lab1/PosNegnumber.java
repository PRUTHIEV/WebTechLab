package Java.Lab.lab1;

import java.util.Scanner;

public class PosNegnumber {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a number :");
        n = input.nextInt();
        if(n >=0 )System.out.print("The number is positive");
        else System.out.print("The number is negative");
    }
}

