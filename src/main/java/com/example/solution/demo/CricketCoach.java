package com.example.solution.demo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    public CricketCoach()
    {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach SetFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String Dailyworkout() {
        return "Bowl fast";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
