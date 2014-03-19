package com.despegar.hf.echo.controller;

import org.springframework.stereotype.Controller;

import com.despegar.hf.calculator.service.Calculator;

@Controller
public class CalculatorController {
    
    private Calculator calculatorService;

    // Put here all exposed operations via RequestMappings

    public Calculator getCalculatorService() {
        return this.calculatorService;
    }

    public void setCalculatorService(Calculator calculatorService) {
        this.calculatorService = calculatorService;
    }
}
