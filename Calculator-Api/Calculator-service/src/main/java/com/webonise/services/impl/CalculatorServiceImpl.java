package com.webonise.services.impl;

import com.webonise.models.CalculatorResult;
import com.webonise.services.CalculatorService;


public class CalculatorServiceImpl implements CalculatorService {

    public CalculatorResult add(int firstValue, int secondValue) {
        int addition = firstValue + secondValue;
        return new CalculatorResult(addition, "ADD");
    }
}
