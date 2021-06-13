package mocks;

import service.Operation;
import service.Reader;

public class MockSubReader implements Reader {

    @Override
    public int readFirstArg() {
        return 12;
    }

    @Override
    public int readSecondArg() {
        return 8;
    }

    @Override
    public Operation readMathOperation() {
        return Operation.SUB;
    }
}
