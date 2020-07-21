package com.example.solution.demo;

public class TrackCoach implements Coach {
    private FortuneService fortuneservice;
    public TrackCoach()
    {

    }
    public TrackCoach(FortuneService fortuneservice)
    {
        this.fortuneservice=fortuneservice;
    }
    @Override
    public String Dailyworkout()
    {
        return " Run 5k";

    }

    @Override
    public String getFortune() {
        return fortuneservice.getFortune();
    }
}
