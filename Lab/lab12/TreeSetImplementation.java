package Java.Lab.lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetImplementation {
    public static void display(TreeSet<?>set){
        for(Object o : set){
            System.out.print(o + " ");
        }
        System.out.println(set.first());
        System.out.println(set.last());
    }
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(List.of("a" , "a" , "b" , "c" , "g" , "b" , "c"));
        ArrayList<Integer>arr1 = new ArrayList<>(List.of(1,2,1,3,4,2,5,7,2,4));
        display(new TreeSet<>(arr));
        display(new TreeSet<>(arr1));
    }
}
