package com.charuka.deshan;

/**
 * @author : Deshan Charuka <d.c.0729439631@gmail.com>
 * @since : ${DATE}
 **/
public class Main {
    public static void main(String[] args) {
        var employee1 = new Employee(50_000);
        var employee = new Employee(50_000, 20);
        Employee.showNumberOfEmployees();
        int wage1 = employee.calculateWage(10);
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}
