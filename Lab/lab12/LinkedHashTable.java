package Java.Lab.lab12;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashTable {
    private static final Scanner input = new Scanner(System.in);
    public static void printHashMap(LinkedHashMap<Integer,Integer>freq){
        for(Map.Entry<Integer,Integer> e : freq.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer>freq = new LinkedHashMap<>();
        int n;
        System.out.print("Enter the number of elements :");
        n = input.nextInt();
        System.out.print("Enter values :");
        for(int i = 0 ; i < n ; i++){
            int val = input.nextInt();
            if(freq.containsKey(val)){
                freq.put(val,freq.get(val) + 1);
            }
            else{
                freq.put(val,1);
            }
        }
        if(freq.containsKey(2)) System.out.println("It is present ");
        if(freq.containsValue(2)) System.out.println("It is too present");
        printHashMap(freq);
    }
}
