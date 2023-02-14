import java.util.Scanner;

class Person {
    String name, address;
    int age;

    Scanner in = new Scanner(System.in);

    void read() {
        System.out.println("\nEnter the Person Details:\n~~~~~ ~~~ ~~~~~~ ~~~~~~~~");
        System.out.print("Name: ");
        name = in.nextLine();
        System.out.print("Age: ");
        age = in.nextInt();
        System.out.print("Address: ");
        in.nextLine();
        address = in.nextLine();
    }
    
    void show() {
        System.out.println("\nPerson Details:\n~~~~~~ ~~~~~~~~");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Address : " + address);
    }
}

class Employee extends Person {
    int EmpId;
    String companyName, dept, desig;
    
    void read() {
        System.out.println("\nEnter the Employee Details:\n~~~~~ ~~~ ~~~~~~~~ ~~~~~~~~");
        System.out.print("ID: ");
        EmpId = in.nextInt();
        System.out.print("Company Name: ");
        in.nextLine();
        companyName = in.nextLine();
        System.out.print("Department: ");
        dept = in.nextLine();
        System.out.print("Designation: ");
        desig = in.nextLine();
    }
    
    void display() {
        System.out.println("\nEmployee Details:\n~~~~~~~~ ~~~~~~~~");
        System.out.println("ID              : " + name);
        System.out.println("Company Name    : " + companyName);
        System.out.println("Department      : " + dept);
        System.out.println("Designation     : " + desig);
    }
}

class EmployeeSalary extends Employee {
    double basic, da, hra, pf, it;
    double gross_salary, deduction, net_salary;
    
    void read() {
        System.out.println("\nEnter the Employee Salary Details:\n~~~~~ ~~~ ~~~~~~~~ ~~~~~~ ~~~~~~~~");
        System.out.print("Basic Salary: ");
        basic = in.nextDouble();
        System.out.print("Dearness Allowance(in %): ");
        da = in.nextDouble();
        System.out.print("House Rent Allowance(in %): ");
        hra = in.nextDouble();
        System.out.print("Provident Fund(pf in %): ");
        pf = in.nextDouble();
        System.out.print("Income Tax(in %): ");
        it = in.nextDouble();
        
        netSalary();
    }
    
    void netSalary() {
        gross_salary = basic + ((da*basic)/100) + ((hra*basic)/100);
        deduction = ((pf*basic)/100) + ((it*basic)/100);
        net_salary = gross_salary - deduction;
    }
    
    void display()
    {
        System.out.println("\nEmployee Salary Details:\n~~~~~~~~ ~~~~~~ ~~~~~~~~");
        System.out.println("Basic Salary    : " + basic);
        System.out.println("Gross Salary    : " + gross_salary);
        System.out.println("Deduction       : " + deduction);
        System.out.println("---------------------------------");
        System.out.println("Net Salary      : " + net_salary);
    }
}

public class Payroll {
    public static void main(String[] args) {
        Person person = new Person();
        Employee emp = new Employee();
        EmployeeSalary salary = new EmployeeSalary();

        person.read();
        person.show();

        emp.read();
        emp.display();

        salary.read();
        salary.display();
    }
}
