package com.despegar.hf.calculator.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.InvalidParameterException;

public class WebCalculator
    implements Calculator {
    Memory memory;

    @Override
    public BigDecimal add(BigDecimal t1, BigDecimal t2) {
        // TODO Auto-generated method stub
        return t1.add(t2);
    }

    @Override
    public BigDecimal subtract(BigDecimal t1, BigDecimal t2) {
        // TODO Auto-generated method stub
        return t1.subtract(t2);
    }

    @Override
    public BigDecimal divide(BigDecimal t1, BigDecimal t2) throws InvalidParameterException {
        // TODO Auto-generated method stub
        if (t2.equals(new BigDecimal("0"))) {
            throw new InvalidParameterException("Error, division by 0.");
        } else {
            return t1.divide(t2, 2, RoundingMode.HALF_UP);
        }
    }

    @Override
    public BigDecimal multiply(BigDecimal t1, BigDecimal t2) {
        // TODO Auto-generated method stub
        return t1.multiply(t2);
    }

    @Override
    public void memoryClear() {
        // TODO Auto-generated method stub
        this.memory.clear();
    }

    @Override
    public BigDecimal memoryRead() {
        // TODO Auto-generated method stub
        return this.memory.read();
    }

    @Override
    public void memoryStore(BigDecimal value) {
        // TODO Auto-generated method stub
        this.memory.store(value);
    }

    @Override
    public void setMemory(Memory memory) {
        // TODO Auto-generated method stub
        this.memory = memory;
    }

    public static void main(String[] args) {
        WebCalculator calc = new WebCalculator();
        System.out.println("Add: " + calc.add(new BigDecimal(5), new BigDecimal(14)));
        System.out.println("Subtract: " + calc.subtract(new BigDecimal(5), new BigDecimal(14)));
        System.out.println("Multiply: " + calc.multiply(new BigDecimal(5), new BigDecimal(14)));
        System.out.println("Divide: " + calc.divide(new BigDecimal(5), new BigDecimal(0)));
    }
}
