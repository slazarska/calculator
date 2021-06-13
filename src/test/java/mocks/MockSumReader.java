package mocks;

import service.Operation;
import service.Reader;

public class MockSumReader implements Reader {

    @Override
    public int readFirstArg() {
        return 1;
    }

    @Override
    public int readSecondArg() {
        return 6;
    }

    @Override
    public Operation readMathOperation() {
        return Operation.SUM;
    }
}
