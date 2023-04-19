package com.fattu.Lift.Management.System;

import java.util.List;

public class Lift {

    private  int LiftNo;

    private int CapacityInWeight;

    private int CapacityInPerson;

    List<Passenger> passengersList;

    public Lift() {
    }

    public Lift(int liftNo, int capacityInWeight, int capacityInPerson, List<Passenger> passengersList) {
        LiftNo = liftNo;
        CapacityInWeight = capacityInWeight;
        CapacityInPerson = capacityInPerson;
      //  this.passengersList = passengersList;
    }

    public int getLiftNo() {
        return LiftNo;
    }

    public void setLiftNo(int liftNo) {
        LiftNo = liftNo;
    }

    public int getCapacityInWeight() {
        return CapacityInWeight;
    }

    public void setCapacityInWeight(int capacityInWeight) {
        CapacityInWeight = capacityInWeight;
    }

    public int getCapacityInPerson() {
        return CapacityInPerson;
    }

    public void setCapacityInPerson(int capacityInPerson) {
        CapacityInPerson = capacityInPerson;
    }

    public List<Passenger> getPassengersList() {
        return passengersList;
    }

    public void setPassengersList(List<Passenger> passengersList) {
        this.passengersList = passengersList;
    }
}
