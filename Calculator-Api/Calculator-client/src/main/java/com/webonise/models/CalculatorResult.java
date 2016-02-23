package com.webonise.models;


import java.io.Serializable;

public class CalculatorResult implements Serializable {

    int result;
    String operationName;

    public CalculatorResult(int result, String operationName) {

        this.result = result;
        this.operationName = operationName;
    }

    public CalculatorResult() {
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }


    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
