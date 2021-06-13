package service.impl;

import exception.DivideByZeroException;
import service.OperationHandler;

public class DivisionOperationHandler implements OperationHandler {

    @Override
    public int invoke(int first, int second) {
        if (first == 0 || second == 0) {
            throw new DivideByZeroException("Error! Dividing by zero is not allowed.");
        } else {
            return first / second;
        }
    }
}



