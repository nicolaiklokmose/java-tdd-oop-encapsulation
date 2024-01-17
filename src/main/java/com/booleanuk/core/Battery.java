package com.booleanuk.core;

public class Battery {
    public String type;
    public int powerRemaining = 100;

    public Battery(String type) {
        this.type = type;
    }

    public int decreasePower(int decrease) {
       this.powerRemaining -= decrease;
       return this.powerRemaining;
    }
}