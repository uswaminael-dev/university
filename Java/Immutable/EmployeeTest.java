package Immutable;

class Employee {
    //fields
    private final String name;
    private final int age;
    private final double salary;
    //constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    //getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
    //methods
    public Employee calculateTax() {
        double tax = this.salary * 0.2;
        return new Employee(this.name, this.age, tax);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("---- Employee Test ----");
        Employee emp1 = new Employee("Alice", 30, 50000);
        Employee emp2 = emp1.calculateTax();
        System.out.println("Employee Name: " + emp1.getName());
        System.out.println("Employee Age: " + emp1.getAge());
        System.out.println("Employee Salary: " + emp1.getSalary());
        System.out.println("Employee Tax: " + emp2.getSalary());
    }
}
