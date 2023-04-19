package com.fattu.Lift.Management.System;

public class Passenger {

    private String passengerId;

    private Lift lift;

    private int weight;

    public Passenger() {
    }

    public Passenger(String passengerId, Lift lift, int weight) {
        this.passengerId = passengerId;
        this.lift = lift;
        this.weight = weight;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public Lift getLift() {
        return lift;
    }

    public void setLiftname(Lift lift) {
        this.lift = lift;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

