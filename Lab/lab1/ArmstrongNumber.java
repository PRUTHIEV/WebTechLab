package Java.Lab.lab1;

import java.util.Scanner;

public class ArmstrongNumber {
    private static Scanner input = new Scanner(System.in);
    public static int numberOfDigits(int num){
        int ans = 0;
        while(num != 0){
            ans ++;
            num /= 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a number :");
        n = input.nextInt();
        int numberOfDigits = numberOfDigits(n);
        int ans = 0;
        int m = n;
        while(m != 0){
            ans += (int)Math.pow(m % 10,numberOfDigits);
            m /= 10;
        }
        if(ans == n)System.out.print("The number " + n + " is an armstrong number ");
        else System.out.print("The number "  + n + " is not an armstrong number ");
    }
}
