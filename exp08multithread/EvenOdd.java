package exp08multithread;

import java.util.*;
class EvenThread extends Thread {
    private int[] numbers;
    EvenThread(int[] numbers) {
        this.numbers = numbers;
    }
    public void run() {
        System.out.println("Even numbers:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
	}
        System.out.println("- End of Even Numbers -");
    }
}


 


class OddThread extends Thread {
    private int[] numbers;
    OddThread(int[] numbers) {
        this.numbers = numbers;
    }
    public void run() {
        System.out.println("Odd numbers:");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.println(num);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println("- End of Odd Numbers -");
    }
}
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];


 

  
      System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        EvenThread even = new EvenThread(arr);
        OddThread odd = new OddThread(arr);

        even.start();  // start even thread first
        try {
            even.join(); // wait till even thread finishes
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        odd.start();   // start odd thread only after even finishes
        try {
            odd.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("\nBoth threads have finished executing!");
    }
}


