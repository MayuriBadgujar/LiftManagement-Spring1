package com.fattu.Lift.Management.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LiftController {
    @Autowired
    LiftService liftservice;

    @PostMapping("/add_lift")
    public String addLift(@RequestBody Lift lift)  {
        liftservice.addLift(lift);
        return "Lift added";
    }

    @PostMapping("/add_passenger")
    public String addPassenger(@RequestBody Passenger passenger){
        return liftservice.addPassenger(passenger);
    }

    @DeleteMapping("/delete_passenger")
    public void deletepassenger(@RequestParam  int passengerId){
        liftservice.deletepassenger(passengerId);
    }
    @GetMapping("/get_people_by_weight")
    public int getPeople(@RequestParam("weight") int weight,@RequestParam("lift") Lift lift) throws Exception {
        return liftservice.getPeople(weight,lift);
    }
}
