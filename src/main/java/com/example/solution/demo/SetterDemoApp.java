package com.example.solution.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach theCoach=context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(theCoach.Dailyworkout());
        System.out.println(theCoach.getFortune());
        context.close();

    }
}
