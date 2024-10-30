package com.tutorial.clean.code.chapter02.c05;

public class İyiÖrnek {

    private String description;

    void setDescription(String description) {
        this.description = description;
    }

    {
        int realDaysPerIdealDay = 4;
        int WORK_DAYS_PER_WEEK = 5;
        int NUMBER_OF_TASKS = 2;
        int [] taskEstimate = new int[4];
        int realdays = 10;

        int sum = 0;
        for (int j=0; j < NUMBER_OF_TASKS; j++) {
            int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
            int realTaskWeeks = (realdays / WORK_DAYS_PER_WEEK);
            sum += realTaskWeeks;
        }
    }

}


