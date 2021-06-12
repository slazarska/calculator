package service.impl;

import service.OperationHandler;

public class SubOperationHandler implements OperationHandler {

    @Override
    public int invoke(int first, int second) {
        return first - second;
    }
}
