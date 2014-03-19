package com.despegar.hf.calculator.service;

import java.math.BigDecimal;

public class CalculatorMemory
    implements Memory {
    BigDecimal value;

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        this.value = null;
    }

    @Override
    public BigDecimal read() {
        // TODO Auto-generated method stub
        return this.value;
    }

    @Override
    public void store(BigDecimal value) {
        // TODO Auto-generated method stub
        this.value = value;
    }

}
