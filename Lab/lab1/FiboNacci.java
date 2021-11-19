package Java.Lab.lab1;

import java.util.Scanner;

public class FiboNacci {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of Fibonacci Series to be generated :");
        n = input.nextInt();
        int []fibo = new int[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2 ; i <= n ; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        System.out.print("The fibonacci series are :");
        for(int i = 0 ; i < fibo.length ; i++){
            System.out.print(fibo[i] + " ");
        }
    }
}
