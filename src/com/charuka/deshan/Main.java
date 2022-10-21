package com.charuka.deshan;

/**
 * @author : Deshan Charuka <d.c.0729439631@gmail.com>
 * @since : ${DATE}
 **/
public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.baseSalary=50_000;
        employee.hourlyRate=20;
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
