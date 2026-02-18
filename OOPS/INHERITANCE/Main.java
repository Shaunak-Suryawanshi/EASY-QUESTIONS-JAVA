package INHERITANCE;

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee(50000);
        System.out.println("Employee Salary: " + emp.calculateSalary());

        Employee mgr = new Manager(70000, 15000); // polymorphism
        System.out.println("Manager Salary: " + mgr.calculateSalary());
    }
}
