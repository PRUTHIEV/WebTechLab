package Java.Lab.lab1;

import java.util.Scanner;

public class PalindromeNumber {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a number :");
        n = input.nextInt();
        int m = n;
        int ans = 0;
        while(n != 0){
            ans = ans * 10 + n % 10;
            n /= 10;
        }
        if(ans == m)System.out.print("The number " + m + " is a palindrome number  ");
        else System.out.print("The number " + m + " is not a palindrome number ");

    }
}
