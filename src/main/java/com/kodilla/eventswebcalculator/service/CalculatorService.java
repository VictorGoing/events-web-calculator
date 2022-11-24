package com.kodilla.eventswebcalculator.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculatorService {

    public BigDecimal addition(int a, int b){
        BigDecimal aBD = new BigDecimal(a);
        BigDecimal bBD = new BigDecimal(b);
        return aBD.add(bBD);
    }

    public BigDecimal subtraction(int a, int b){
        BigDecimal aBD = new BigDecimal(a);
        BigDecimal bBD = new BigDecimal(b);
        return aBD.subtract(bBD);
    }

    public BigDecimal divide(int a, int b){
        BigDecimal aBD = new BigDecimal(a);
        BigDecimal bBD = new BigDecimal(b);
        return aBD.divide(bBD);
    }

    public BigDecimal multiply(int a, int b){
        BigDecimal aBD = new BigDecimal(a);
        BigDecimal bBD = new BigDecimal(b);
        return aBD.multiply(bBD);
    }

}
