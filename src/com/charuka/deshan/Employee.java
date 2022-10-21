package com.charuka.deshan;

/**
 * @author : Deshan Charuka <d.c.0729439631@gmail.com>
 * @since : 2022-10-22
 **/
public class Employee {
    public int baseSalary;
    public int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
