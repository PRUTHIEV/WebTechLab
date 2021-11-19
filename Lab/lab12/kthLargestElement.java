package Java.Lab.lab12;

import java.util.*;

public class kthLargestElement {
    private static final Scanner input = new Scanner(System.in);
    public static void readInput(PriorityQueue<?>pq){
        int k;
        System.out.println("Enter the k th elements :");
        k = input.nextInt();
        Object kthLargest = null;
        while(k != 0){
            kthLargest = pq.poll();
            k--;
        }
        System.out.println("The kth largest element is :" + kthLargest);
    }
    public static void main(String[] args) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<String>arr = new ArrayList<>(List.of("a" , "a" , "b" , "c" , "g" , "b" , "c"));
        ArrayList<Integer>arr1 = new ArrayList<>(List.of(1,2,1,3,4,2,5,7,2,4));
        readInput(new PriorityQueue<>(arr));
        readInput(new PriorityQueue<>(arr1));

    }
}
