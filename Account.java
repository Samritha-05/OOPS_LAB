//abstract class
abstract class Account {
    int acc_no;
    String acc_name;
    double balance;

    // Constructor
    Account(int acc_no, String acc_name, double balance) {
        this.acc_no = acc_no;
        this.acc_name = acc_name;
        this.balance = balance;
    }

    // Abstract method to be implemented by concrete subclasses
    abstract void displayCustomer();
}