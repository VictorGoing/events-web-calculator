package com.kodilla.eventswebcalculator.event;

import org.springframework.context.ApplicationEvent;

import java.math.BigDecimal;

public class CalculatorEvent extends ApplicationEvent {

    private BigDecimal a;
    private BigDecimal b;
    private String operation;

    public CalculatorEvent(Object source, BigDecimal a, BigDecimal b, String operation) {
        super(source);
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public BigDecimal getA() {
        return a;
    }

    public BigDecimal getB() {
        return b;
    }

    public String getOperation() {
        return operation;
    }
}
