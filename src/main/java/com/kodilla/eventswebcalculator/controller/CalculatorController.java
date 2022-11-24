package com.kodilla.eventswebcalculator.controller;

import com.kodilla.eventswebcalculator.event.CalculatorEvent;
import com.kodilla.eventswebcalculator.service.CalculatorService;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/v1/calculator")
public class CalculatorController implements ApplicationEventPublisherAware {

    private final CalculatorService calculatorService;
    private ApplicationEventPublisher publisher;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path="addition")
    public BigDecimal addition(@RequestParam int a,@RequestParam int b){
         BigDecimal result = calculatorService.addition(a,b);
         publisher.publishEvent(new CalculatorEvent(this, new BigDecimal(a), new BigDecimal(b), "add") );
        return result;
    }

    @GetMapping(path="subtraction")
    public BigDecimal subtraction(@RequestParam int a,@RequestParam int b){
        BigDecimal result = calculatorService.subtraction(a,b);
        publisher.publishEvent(new CalculatorEvent(this, new BigDecimal(a), new BigDecimal(b), "subtract") );
        return result;
    }

    @GetMapping(path="divide")
    public BigDecimal divide(@RequestParam int a,@RequestParam int b){
        BigDecimal result = calculatorService.divide(a,b);
        publisher.publishEvent(new CalculatorEvent(this, new BigDecimal(a), new BigDecimal(b), "divide") );
        return result;
    }

    @GetMapping(path="multiply")
    public BigDecimal multiply(@RequestParam int a,@RequestParam int b){
        BigDecimal result = calculatorService.multiply(a,b);
        publisher.publishEvent(new CalculatorEvent(this, new BigDecimal(a), new BigDecimal(b), "multiply") );
        return result;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
