package com.tutorial.clean.code.chapter03.c03;

import java.util.List;

public class TestDrive {
        // S OLID
     /*
        FUNCTIONS SHOULD DO ONE THING. THEY SHOULD DO IT WELL. THEY SHOULD DO IT ONLY
      */

    private List<Passenger> passengerList;
    String state;

    public void addPassenger(Passenger p){
        this.passengerList.add(p);
        if (passengerList.size() < 10)
            this.state = "Empty";
        else if (passengerList.size() < 30)
            this.state = "Half";
        else if (passengerList.size() >= 30)
            this.state = "Full";
    }

}
