package com.example.solution.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication  {
    public static void main(String[] args) {
        Coach thecoach=new TrackCoach();
        System.out.println(thecoach.Dailyworkout());
    }
}
