package service.impl;

import service.OperationHandler;

public class DivisionOperationHandler implements OperationHandler {

    @Override
    public int invoke(int first, int second) {
        return first / second;
    }
}
