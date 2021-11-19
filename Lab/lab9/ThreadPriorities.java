package Java.Lab.lab9;

import java.util.Scanner;

public class ThreadPriorities{
    private static final Scanner input = new Scanner(System.in);
    public static void printTopPattern(int n){
        for(int i = n-1,k = 0 ; i >= 0 ;  i--,k++){
            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
            for(int l = 0 ; l <= k ; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printBottomPattern(int n){
        for(int i = n-1,k = 0 ; i >=0 ; i --,k ++){
            for(int j = n-1 ; j > i ; j--){
                System.out.print(" ");
            }
            for(int l = 0 ; l <= i ; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a number :");
        n = input.nextInt();
        Thread t1 = new Thread(() -> {
           printTopPattern(n);
        });
        Thread t2 = new Thread(() -> {
           printBottomPattern(n);
        });
        t1.setPriority(10);
        t2.setPriority(9);
        t1.start();
        t2.start();
    }
}