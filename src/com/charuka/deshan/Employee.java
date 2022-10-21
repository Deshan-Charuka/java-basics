package com.charuka.deshan;

/**
 * @author : Deshan Charuka <d.c.0729439631@gmail.com>
 * @since : 2022-10-22
 **/
public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public void setBaseSalary(int baseSalary){
        if (baseSalary < 0)
            throw new IllegalArgumentException("Salary should be larger than zero!!");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate){
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly Rate should be larger than zero!!");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate(){
        return hourlyRate;
    }
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
