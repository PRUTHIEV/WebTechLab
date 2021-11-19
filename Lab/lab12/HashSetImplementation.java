package Java.Lab.lab12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetImplementation {
    private static final Scanner input = new Scanner(System.in);
    public static void readInput(ArrayList<Integer> arr, int n){
        System.out.print("Enter the elements :");
        for(int  i = 0 ; i <n ; i ++){
            arr.add(input.nextInt());
        }
    }
    public static boolean isSum(ArrayList<Integer>arr,int sum){
        HashSet<Integer>set = new HashSet<>();
        int prefixSum = 0;
        for(int i = 0 ; i < arr.size() ; i++){
            prefixSum += arr.get(i);
            if(prefixSum == sum)return true;
            if(set.contains(prefixSum - sum))return true;
            set.add(prefixSum);
        }
        return false;
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of elements :");
        n = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        readInput(arr,n);
        int sum;
        System.out.print("Enter the sum :");
        sum = input.nextInt();
        if(isSum(arr,sum)) System.out.println("The subarray with given sum is present");
        else System.out.println("The subarray withe given sum is not present");
    }
}
