package Java.Lab.lab12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashTable {
    private static final Scanner input = new Scanner(System.in);
    public static void readInput(ArrayList<Integer>arr,int n){
        System.out.print("Enter the elements :");
        for(int  i = 0 ; i <n ; i ++){
            arr.add(input.nextInt());
        }
    }
    public static int countSubarraySum(ArrayList<Integer>arr,int sum){
        HashMap<Integer,Integer>map = new HashMap<>();
        int prefixSum = 0;
        int count = 0;
        for(int i = 0 ; i < arr.size() ; i++){
            prefixSum += arr.get(i);
            if(prefixSum == sum)count ++;
            if(map.containsKey(prefixSum - sum))count += map.get(prefixSum - sum);
            if(map.containsKey(prefixSum))map.put(prefixSum , map.get(prefixSum) + 1);
            else map.put(prefixSum,1);
        }
        return count;
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
        System.out.println("The number of subarrays with given sum is :" + countSubarraySum(arr,sum));
    }
}
