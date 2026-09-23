// Q. Write a Java program to create an Employee class with name, id, and salary.
// Use a parameterized constructor and a method to calculate a 10% bonus based
// on the employee's salary. Create three employee objects and display each
// employee's name, salary, bonus, and final salary.

class Employee {

    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public void Bonus() {
        double bonus = salary * 0.1;
        double finalSalary = salary + bonus;

        System.out.println("Bonus: " + bonus);
        System.out.println("Final Salary: " + finalSalary);
    }
}

public class EmployeeBonus {

    public static void main(String[] args) {

        Employee e1 = new Employee("Ram", 123, 20000);
        Employee e2 = new Employee("Shyam", 124, 25000);
        Employee e3 = new Employee("Hari", 125, 30000);

        e1.display();
        e1.Bonus();

        System.out.println();

        e2.display();
        e2.Bonus();

        System.out.println();

        e3.display();
        e3.Bonus();
    }
}