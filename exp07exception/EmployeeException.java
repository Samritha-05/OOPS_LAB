package exp07exception;

import java.util.Scanner;

import java.util.Scanner;

class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }
}

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class EmployeeException {

    public static Employee createEmployee(String name, int age) throws NameException, AgeException {
        name = name.trim();

        // ✅ Throw exception ONLY if the entire name is a number
        if (name.matches("\\d+")) {
            throw new NameException("Invalid Name: Name cannot be a number!");
        }

        if (age > 50) {
            throw new AgeException("Invalid Age: Age cannot be greater than 50!");
        }

        return new Employee(name, age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter employee name: ");
            String name = sc.nextLine();
            System.out.print("Enter employee age: ");
            int age = sc.nextInt();

            Employee emp = createEmployee(name, age);
            emp.display();
        } catch (NameException | AgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
