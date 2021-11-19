package Java.Lab.lab1;

import java.util.Scanner;

public class Factorial {
    private static Scanner input = new Scanner(System.in);
    public static long  getFactorial(int num){
        long ans = 1;
        for(int i =2 ; i <= num ; i++){
            ans *= i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a number :");
        n = input.nextInt();
        System.out.print("The factorial of the numnber " + n +" is :" + getFactorial(n));
    }
}
