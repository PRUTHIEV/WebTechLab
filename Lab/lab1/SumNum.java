package Java.Lab.lab1;

public class SumNum {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 100 ; i < 200 ; i++){
            if(i % 4 == 0)sum += i;
        }
        System.out.print("The sum of the numbers >= 100 and < 200 is :" + sum);
    }
}
