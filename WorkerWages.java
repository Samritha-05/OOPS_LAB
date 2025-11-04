import java.util.Scanner;
public class WorkerWages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Worker worker = null;

        int choice;

        do {
            System.out.println("\n=== Worker Payment Menu ===");
            System.out.println("1. Enter details for Daily Worker");
            System.out.println("2. Enter details for Salaried Worker");
            System.out.println("3. Calculate Pay");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); 
                    System.out.print("Enter Daily Worker's Name: ");
                    String dName = sc.nextLine();
                    System.out.print("Enter Salary Rate per day: ");
                    double dRate = sc.nextDouble();
                    System.out.print("Enter Number of Days worked: ");
                    int dDays = sc.nextInt();

                    worker = new DailyWorker(dName, dRate, dDays);
                    System.out.println("Daily Worker details saved.");
                    break;

                case 2:
                    sc.nextLine(); 
                    System.out.print("Enter Salaried Worker's Name: ");
                    String sName = sc.nextLine();
                    System.out.print("Enter Salary Rate per hour: ");
                    double sRate = sc.nextDouble();
                    System.out.print("Enter Number of Hours worked: ");
                    int sHours = sc.nextInt();

                    worker = new SalariedWorker(sName, sRate, sHours);
                    System.out.println("Salaried Worker details saved.");
                    break;

                case 3:
                    if (worker == null) {
                        System.out.println("No worker details entered yet.");
                    } else {
                        worker.display();
                       
                        double pay = worker.computePay(0);
                        System.out.println("Computed Pay: Rs. " + pay);
                    }
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

    }
}