package exp08multithread;

import java.util.*;
class Divisors extends Thread {
    int num;
    Divisors(int n) {
        num = n;
    }
    public void run() {
        System.out.println("Divisors of " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
 


                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println("- End of Divisors -");
    }
}
class MultiplicationTable extends Thread {
    int num;
    MultiplicationTable(int n) {
        num = n;
    }
    public void run() {
        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
System.out.println(e);
            }
        }
 


        System.out.println("- End of Table -");
    }}
public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        Divisors d = new Divisors(n);
        MultiplicationTable m = new MultiplicationTable(n);
        // Start the Divisors thread first
        d.start();
        try {
            d.join(); // wait till divisors thread completes
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        // Then start multiplication table thread
        m.start();
        try {
            m.join(); // wait till table thread completes
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("\nBoth threads have finished executing!");
    }
}
