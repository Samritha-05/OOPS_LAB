import java.util.Scanner;
//A SAMRITHA(URK24CS6011)
// Main class
public class BankingOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Initial customer record
        System.out.print("Enter Account Number: ");
        int id = sc.nextInt();
        sc.nextLine(); // clear buffer
        
        System.out.print("Enter Account Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        // Assuming Bank, Account, and Transaction are defined as shown above
        Bank customer = new Bank(id, name, balance);

        int choice;
        do {
            System.out.println("\n--- Account Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Enquiry");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter Deposit Amount: ");
                        double amount = sc.nextDouble();
                        customer.deposit(amount);
                        break;
                    case 2:
                        System.out.print("Enter Withdraw Amount: ");
                        double cash = sc.nextDouble();
                        customer.withdraw(cash);
                        break;
                    case 3:
                        customer.viewBalance();
                        break;
                    case 4:
                        customer.viewAccountDetails();
                        break;
                    case 5:
                        System.out.println("Exiting... Thank you!");
                        break;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number from 1 to 5.");
                sc.next(); // Consume the invalid input
                choice = 0; // Set choice to an invalid number to continue loop
            }
        } while (choice != 5); // Corrected condition to exit on choice 5
        
        sc.close();
    }
}