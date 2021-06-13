package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.OperationHandler;
import service.impl.*;

public class OperationHandlerTests {

    private OperationHandler handler;

    @Test
    void sumTest() {
        handler = new SumOperationHandler();
        Assertions.assertEquals(8, handler.invoke(3, 5));
    }

    @Test
    void subTest() {
        handler = new SubOperationHandler();
        Assertions.assertEquals(4, handler.invoke(10, 6));
    }

    @Test
    void multTest() {
        handler = new MultOperationHandler();
        Assertions.assertEquals(5, handler.invoke(1, 5));
    }

    @Test
    void divTest() {
        handler = new DivisionOperationHandler();
        Assertions.assertEquals(5, handler.invoke(10, 2));
    }

    @Test
    void modularDivTest() {
        handler = new ModularDivOperationHandler();
        Assertions.assertEquals(1, handler.invoke(10, 3));
    }

    @Test
    void powTest() {
        handler = new PowOperationHandler();
        Assertions.assertEquals(256, handler.invoke(4, 4));
    }
}
