package Java.Lab.lab9;

import java.util.LinkedList;
import java.util.Scanner;

class SetGetItem1 {
    private int capacity;
    private LinkedList<Integer> values = new LinkedList<>();

    SetGetItem1(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public synchronized void setItem(int item) {
        while (values.size() == capacity) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        values.add(item);
        notifyAll();
    }

    public synchronized int getItem() {
        while (values.isEmpty()) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        notify();
        return values.pollFirst();
    }
}

class Producer1 implements Runnable {
    private SetGetItem1 setGetItem;
    private int item;

    public Producer1(int item, SetGetItem1 setGetItem) {
        this.item = item;
        this.setGetItem = setGetItem;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Set :" + item);
            setGetItem.setItem(item++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Consumer1 implements Runnable {
    private SetGetItem1 setGetItem;

    public Consumer1(SetGetItem1 setGetItem) {
        this.setGetItem = setGetItem;
    }

    @Override
    public void run() {
        while (true) {
            int Get = setGetItem.getItem();
            System.out.println("Get :" + Get);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ProducerConsumer {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the starting items and capacity of the buffer: ");
        int number = input.nextInt();
        int cap = input.nextInt();
        SetGetItem1 setGetItem = new SetGetItem1(cap);
        new Thread(new Producer1(number, setGetItem)).start();
        new Thread(new Consumer1(setGetItem)).start();
    }
}
