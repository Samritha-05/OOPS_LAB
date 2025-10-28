//concrete class
class Bank extends Account implements Transaction {
    // Constructor
    Bank(int acc_no, String acc_name, double balance) {
        super(acc_no, acc_name, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. " + "\n" + amount + " added.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double cash) {
        if (cash > 0 && cash <= balance) { // Added check for positive cash
            balance = balance - cash;
            System.out.println("Withdraw successful. Remaining Balance: " + balance);
        } else if (cash <= 0) {
            System.out.println("Withdraw amount must be positive.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    @Override
    public void viewBalance() {
        System.out.println("Current Balance: " + balance);
    }

    @Override
    public void viewAccountDetails() {
        displayCustomer();
    }

    @Override
    void displayCustomer() {
        System.out.println("\n-- Account Details --");
        System.out.println("Account Number: " + acc_no);
        System.out.println("Account Name: " + acc_name);
        System.out.println("Account Balance: " + balance);
    }
}

