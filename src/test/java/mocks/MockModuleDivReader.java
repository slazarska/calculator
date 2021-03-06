package mocks;

import service.Operation;
import service.Reader;

public class MockModuleDivReader implements Reader {

    @Override
    public int readFirstArg() {
        return 10;
    }

    @Override
    public int readSecondArg() {
        return 3;
    }

    @Override
    public Operation readMathOperation() {
        return Operation.MODDIV;
    }
}
