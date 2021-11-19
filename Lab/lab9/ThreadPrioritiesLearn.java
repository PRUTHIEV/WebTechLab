package Java.Lab.lab9;

import java.util.Scanner;

public class ThreadPrioritiesLearn {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            System.out.println("This is thread 1");
            int n = input.nextInt();
            for(int i = 0 ; i <5 ; i ++){
                System.out.print("* ");
            }
        });
        Thread t2 = new Thread(() -> {
            System.out.println("This is thread 2");
            for(int i = 0 ; i <5 ; i ++){
                System.out.print("# ");
            }
        });
        t1.setPriority(10);
        t2.setPriority(9);
        t1.start();
        t2.start();
        System.out.println("Main Thread "  + Thread.currentThread().getPriority());
    }
}
