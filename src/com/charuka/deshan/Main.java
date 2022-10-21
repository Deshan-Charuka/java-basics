package com.charuka.deshan;

/**
 * @author : Deshan Charuka <d.c.0729439631@gmail.com>
 * @since : ${DATE}
 **/
public class Main {
    public static void main(String[] args) {

        int baseSalary = 50_000;
        byte hourlyRate = 20;
        byte extraHours = 10;

        int wage = calculateSalary(baseSalary,hourlyRate,extraHours);
        System.out.println(wage);
    }

    public static int calculateSalary(int salary,int hourlyRate,int extraHours){
        return salary + (hourlyRate * extraHours);
    }
}
