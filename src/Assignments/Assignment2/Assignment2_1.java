package Assignments.Assignment2;

import java.util.*;

/**
 * The deadline of this assignment is 09/25/2020 23:59 PST.
 * Please feel free to contact Yafei and Yaqi for any questions.
 */

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    // Constructor. Please set all the data in constructor.


    public Employee(String name, int age, Gender gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    // Getter for `name`. Return the current `name` data


    public String getName() {

        return name;
    }

    // Setter for `name`. Set `name` data

    public void setName(String name) {

        this.name = name;
    }

    public double getSalary() {
        return salary;
    }


    //Extra credit
    public void raiseSalary(double byPercent){
        this.salary= this.salary*(1+byPercent);
    }
}

enum Gender {
    MALE,
    FEMALE;
}

public class Assignment2_1 {
    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
        if (employee.salary <= 8900.0) {
            return 0.062 * employee.salary;
        } else {
            return 0.062 * 106800;
        }
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public double insuranceCoverage(Employee employee) {
        if (employee.age < 35) {
            return 0.03 * employee.salary;
        } else if (employee.age >= 35 && employee.age <= 50) {
            return 0.04 * employee.salary;
        } else if (employee.age > 50 && employee.age < 60) {
            return 0.05 * employee.salary;
        } else {
            return 0.06 * employee.salary;
        }
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public void sortSalary(Employee e1, Employee e2, Employee e3) {
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.sort(Comparator.comparing(Employee::getSalary));
        for (Employee employee :
                employees) {
            System.out.println(employee.name);
        }

    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public void tripleSalary(Employee employee) {
        employee.salary= employee.salary*3;

    }



    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     write your understanding here.

     Because Employee is Class, it is reference type. The original Employee a and Employee b are the first one reference to the object
     on the heat. Only take Employee a for example. IN the method 'swap(a, b)', this a is the second copy, so only swap the second copy,
     not the original object. Although all two point to the same allocation on the heat, not the same object.

     BTW,I draw a sketch on https://t.me/Svelarr/20, Please check.



    */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        Employee c = new Employee("Sun", 24, Gender.MALE, 19900);
        Assignment2_1 Assignment = new Assignment2_1();
        Assignment.sortSalary(a,b,c);
        Assignment.tripleSalary(a);
        System.out.println(a.salary);
        a.raiseSalary(0.5);
        System.out.println(a.salary);
        System.out.println(Assignment.socialSecurityTax(b));
        System.out.println(Assignment.insuranceCoverage(c));

        System.out.println();
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }

/*
  Output:

  Jenny
  John
  Sun
  6000.0
  9000.0
  155.0
  597.0

  Before: a=Jenny
  Before: b=John
  After: a=Jenny
  After: b=John*/


}

