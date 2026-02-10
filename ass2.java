import java.util.Scanner;
// Base Class
class Employee {
    protected double salary;
    protected double updatedSalary;
    public Employee(double salary) {
        this.salary = salary;
        this.updatedSalary = salary;
    }
    // Method to display salary
    public void displaySalary() {
        System.out.println("Salary before hike: " + salary);
        System.out.println("Salary after hike : " + updatedSalary);
    }
}
// Derived Class - Full Time Employee
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(double salary) {
        super(salary);
    }
    // Method to calculate salary with 50% hike
    public void calculateSalary() {
        updatedSalary = salary + (salary * 0.50);
    }
}
// Derived Class - Intern Employee
class InternEmployee extends Employee {
    public InternEmployee(double salary) {
        super(salary);
    }
    // Method to calculate salary with 25% hike
    public void calculateSalary() {
        updatedSalary = salary + (salary * 0.25);
    }
}
public class ass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Full Time Employee
        System.out.print("Enter Full Time Employee Salary: ");
        double ftSalary = sc.nextDouble();
        FullTimeEmployee fte = new FullTimeEmployee(ftSalary);
        fte.calculateSalary();
        System.out.println("\nFull Time Employee Details");
        fte.displaySalary();
        // Intern Employee
        System.out.print("\nEnter Intern Employee Salary: ");
        double internSalary = sc.nextDouble();
        InternEmployee intern = new InternEmployee(internSalary);
        intern.calculateSalary();
        System.out.println("\nIntern Employee Details");
        intern.displaySalary();
        sc.close();
    }
}
