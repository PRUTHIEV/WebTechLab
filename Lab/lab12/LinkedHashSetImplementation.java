package Java.Lab.lab12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetImplementation {
    public static void removePrintDuplicates(ArrayList<?> arr){
        LinkedHashSet<?>set = new LinkedHashSet<>(arr);
        Iterator<?> it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String []  str = new String[]{"a" , "a" , "b" , "c" , "g" , "b" , "c"};
        Integer [] str1 = new Integer[] {1,2,1,3,4,2,5,7,2,4};
        removePrintDuplicates(new ArrayList<>(Arrays.asList(str)));
        removePrintDuplicates(new ArrayList<>(Arrays.asList(str1)));
    }
}
