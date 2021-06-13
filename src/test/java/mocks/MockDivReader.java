package mocks;

import service.Operation;
import service.Reader;

public class MockDivReader implements Reader {

    @Override
    public int readFirstArg() {
        return 10;
    }

    @Override
    public int readSecondArg() {
        return 2;
    }

    @Override
    public Operation readMathOperation() {
        return Operation.DIV;
    }
}
