package com.despegar.hf.calculator.config;

import org.springframework.context.annotation.Bean;

import com.despegar.hf.calculator.service.Calculator;
import com.despegar.hf.calculator.service.WebCalculator;

public class CalculatorConfig {
    Calculator calculator;

    @Bean
    public Calculator calculatorService() {
        return new WebCalculator();
    }
}
