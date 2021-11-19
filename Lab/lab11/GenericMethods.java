package Java.Lab.lab11;

public class GenericMethods {
    public static<T> void print(T [] arr){
        for(Object o : arr){
            System.out.print(o + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{1,2,3,4,5,6,7,8};
        Double [] arr2 = new Double[]{1.1,1.2,1.3,1.4,1.5,1.6,1.7};
        String [] arr3 = new String []{"C++" , "Java" , "Python" , "C#"};
        print(arr1);
        print(arr2);
        print(arr3);
    }
}
