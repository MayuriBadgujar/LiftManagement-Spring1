package com.fattu.Lift.Management.System;

import java.util.HashMap;

@org.springframework.stereotype.Repository
public class LiftRepository {

    HashMap<String,Lift> liftHashMap=new HashMap<>();
    HashMap<String,Passenger> passengerHashMap=new HashMap<>();

    public  void addLift(Lift lift){

        liftHashMap.put(String.valueOf(lift.getLiftNo()),lift);
    }


    public String addPassenger(Passenger passenger) {
        if (passengerHashMap.containsKey((passenger.getPassengerId()))) {
            return "PASSENGER has been already there";
        } else
            passengerHashMap.put(passenger.getPassengerId(), passenger);
        return "Book has been added Successfully";
    }

    public void deletepassenger(int PassengerId) {
        for(Passenger passenger : passengerHashMap.values()){
            int passengerId= Integer.parseInt(passenger.getPassengerId());
            if(passengerId > 5){
                passengerHashMap.remove(passenger);
            }
        }
    }

    public int getPeople(int weight ,Lift lift)throws  Exception{
       int findPassenger = 0;
        for(Passenger passenger : passengerHashMap.values()){
            if(passenger.getWeight()>50  && passenger.getLift().equals(lift) ){
                findPassenger++;
                }

            else{
                throw new Exception("eople not found not found");
            }
        }
        return findPassenger;

    }

}
