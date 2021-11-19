package Java.Lab.lab12;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class NextGreaterElement {
    public static void nextGreaterElement(ArrayList<Integer> arr){
        ArrayDeque<Integer>ad = new ArrayDeque<>();
        int n = arr.size()-1;
        for(int i = 0 ; i < arr.size() ; i++){
            while(!ad.isEmpty() && arr.get(ad.getLast()) < arr.get(i)) {
                System.out.println(ad.getLast());
                arr.set(ad.getLast(), arr.get(i));
                System.out.println(arr);
                ad.pollLast();
            }
            ad.addLast(i);
        }
        while(!ad.isEmpty()){
            arr.set(ad.getLast(),-1);
            ad.pollLast();
        }
        System.out.println(arr);
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>(List.of(13,7,6,12));
        nextGreaterElement(arr);
    }
}
