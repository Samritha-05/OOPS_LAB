package controlstatements;

import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 1000;  
        while (true) {
            System.out.println("\n**** SIMPLE ATM SYSTEM  ****");
            System.out.println("1. Check account Balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit the application");
            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: Rs." + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: Rs.");
                    int deposit = sc.nextInt();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Rs." + deposit + " deposited successfully.");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw:Rs.");
                    int withdraw = sc.nextInt();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Rs." + withdraw + " withdrawn successfully.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the application");
                    return;

                default:
                    System.out.println("Invalid choice!Please try again!");
            }}}}
 
