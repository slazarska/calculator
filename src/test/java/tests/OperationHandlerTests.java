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
        int sum = handler.invoke(3, 5);
        Assertions.assertEquals(8, sum);
    }

    @Test
    void multTest() {
        handler = new MultOperationHandler();
        Assertions.assertEquals(15, handler.invoke(3, 5));
    }

    @Test
    void subTest() {
        handler = new SubOperationHandler();
        Assertions.assertEquals(4, handler.invoke(10, 6));
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
}
