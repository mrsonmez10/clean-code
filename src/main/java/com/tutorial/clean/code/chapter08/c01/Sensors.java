package com.tutorial.clean.code.chapter08.c01;

import java.util.HashMap;
import java.util.Map;

public class Sensors {

    private Map sensors = new HashMap();

    public Sensor getById(String id) {
        return (Sensor) sensors.get(id);
    }

}
