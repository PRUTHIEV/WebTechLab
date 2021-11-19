package Java.Lab.lab9;

import java.util.*;

class SortArrayEven implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 % 2 == 0 && o2 % 2 == 0) {
            return o1 - o2;
        }
        else if(o1 % 2 == 0 && o2 % 2 == 1)return -1;
        else if(o1 % 2 == 1 && o2 % 2 == 0)return 1;
        else return o1 - o2;
    }
}

public class OddEvenSeparate {
    private static final Scanner input = new Scanner(System.in);
    public static void readInput(Integer []arr,int n){
        System.out.print("Enter the elements :");
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }
    }
    public static void sortEvenOddNumbers(Integer []arr,int n){
        Arrays.sort(arr,new SortArrayEven());
        System.out.println("The array is sorted using " + Thread.currentThread().getName());
    }
    public static void calAvgEvenNumbers(Integer []arr,double []avg,int n){
        double evenAvg = 0.00;
        for(int i = 0 ; i < n ; i ++){
            if(arr[i] % 2 == 0)evenAvg += arr[i];
        }
        avg[0] =  evenAvg / n;
        System.out.println("The average of even numbers are calculated using " + Thread.currentThread().getName());
    }
    public static void calAvgOddNumbers(Integer []arr,double []avg , int n){
        double oddAvg = 0.00;
        for(int i = 0 ; i < n ; i ++){
            if(arr[i] % 2 == 1)oddAvg += arr[i];
        }
        avg[1] =  oddAvg / n;
        System.out.println("The average of odd numbers are calculated using " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of elements :");
        n = input.nextInt();
        Integer []arr = new Integer[n];
        readInput(arr,n);
        double [] avg = new double[2];
        Thread []thread = new Thread[3];
        (thread[0] = new Thread(() -> {
            sortEvenOddNumbers(arr,n);
        })).start();
        (thread[1] = new Thread(() -> {
          calAvgEvenNumbers(arr,avg,n);
        })).start();
        (thread[2] = new Thread(() -> {
           calAvgOddNumbers(arr,avg,n);
        })).start();
        for(int i = 0 ; i < 3 ; i ++){
            try{
                thread[i].join();
            }
            catch(InterruptedException exception){
                exception.printStackTrace();
            }
        }
        System.out.println("The array after separating even and odd numbers :");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nThe even average  is " + avg[0]);
        System.out.println("The Odd average is :" + avg[1]);

    }
}
