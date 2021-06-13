package service.impl;

import service.OperationHandler;

public class PowOperationHandler implements OperationHandler {

    @Override
    public int invoke(int first, int second) {
        return (int) Math.pow(first, second);
    }
}
