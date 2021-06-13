package mocks;

import service.Operation;
import service.Reader;

public class MockPowReader implements Reader {

    @Override
    public int readFirstArg() {
        return 2;
    }

    @Override
    public int readSecondArg() {
        return 7;
    }

    @Override
    public Operation readMathOperation() {
        return Operation.POW;
    }
}
