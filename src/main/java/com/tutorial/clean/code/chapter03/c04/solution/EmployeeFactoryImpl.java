package com.tutorial.clean.code.chapter03.c04.solution;

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
