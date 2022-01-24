package com.tutorial.clean.code.chapter3.c04.solution;

import com.tutorial.clean.code.chapter3.c04.Money;

import static com.tutorial.clean.code.chapter3.c04.Employee.*;

public class EmployeeFactoryImpl implements EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord r) {
        switch (r) {
//            case COMMISSIONED:
//                return new HourlyEmployee(r) ;
            case HOURLY:
                return new HourlyEmployee(r);
//            case SALARIED:
//                return new SalariedEmploye(r);
            default:
                return null;
        }
    }


}
