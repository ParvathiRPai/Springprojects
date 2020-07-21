package com.example.solution.demo;

public class Baseballcoach implements Coach {
    private FortuneService fortuneservice;
    public Baseballcoach(FortuneService thefortuneservice)
    {
        fortuneservice=thefortuneservice;
    }
    @Override
    public String Dailyworkout(){
        return "Spend 30min in the Gym";
    }

    @Override
    public String getFortune() {
        return fortuneservice.getFortune();
    }
}
