package com.fattu.Lift.Management.System;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service

public class LiftService {
    @Autowired
    LiftRepository liftrepository;

    public void addLift(Lift lift){
         liftrepository.addLift(lift);
      //  return "Lift added";
    }
    public String  addPassenger( Passenger passenger){

        return liftrepository.addPassenger(passenger);
    }
    public void deletepassenger( int passengerId){

        liftrepository.deletepassenger(passengerId);
    }

    public int getPeople(int weight, Lift lift) throws Exception {
        return liftrepository.getPeople(weight,lift);
    }
}
