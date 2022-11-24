package com.kodilla.eventswebcalculator.service;

import com.kodilla.eventswebcalculator.event.CalculatorEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CalculatorManager implements ApplicationListener<CalculatorEvent> {
    @Override
    public void onApplicationEvent(CalculatorEvent event) {
        System.out.println("Processing... " + " " + event.getA() + " " + event.getOperation() + " " + event.getB());
    }
}
