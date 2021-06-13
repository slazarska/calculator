package mocks;

import service.Operation;
import service.Reader;

public class MockModuleDivByZeroReader implements Reader {

    @Override
    public int readFirstArg() {
        return 8;
    }

    @Override
    public int readSecondArg() {
        return 0;
    }

    @Override
    public Operation readMathOperation() {
        return Operation.MODDIV;
    }
}
