class Worker {
    protected String name;
    protected double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    // Compute pay based on hours (can be overridden)
    public double computePay(int hours) {
        return salaryRate * hours;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary Rate: " + salaryRate);
    }
}

// Subclass DailyWorker
class DailyWorker extends Worker {
    private int no_of_days;

    public DailyWorker(String name, double salaryRate, int no_of_days) {
        super(name, salaryRate);
        this.no_of_days = no_of_days;
    }

    // Override to compute pay based on number of days worked
    @Override
    public double computePay(int hours) {
        // ignore hours, pay based on no_of_days * salaryRate
        return no_of_days * salaryRate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Number of Days Worked: " + no_of_days);
    }
}

// Subclass SalariedWorker
class SalariedWorker extends Worker {
    private int no_of_hours;

    public SalariedWorker(String name, double salaryRate, int no_of_hours) {
        super(name, salaryRate);
        this.no_of_hours = no_of_hours;
    }

    // Override: Paid wages for 40 hours regardless of actual hours worked
    @Override
    public double computePay(int hours) {
        return salaryRate * 40;  // fixed 40 hours pay
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Number of Hours Worked: " + no_of_hours);
    }
}