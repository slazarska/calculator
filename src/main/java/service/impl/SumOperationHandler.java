package service.impl;

import service.OperationHandler;

public class SumOperationHandler implements OperationHandler {

    @Override
    public int invoke(int first, int second) {
        return first + second;
    }
}
