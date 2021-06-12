package tests;

import mocks.MockMultReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.Calculator;

public class CalculatorTests {

    private Calculator calculator;

    //    @ParameterizedTest
//    @EnumSource(Operation.class)
//    @Test
//    void calculatorTest() {
//        calculator = new Calculator((new MockMultReader()));
//        String result = calculator.start();
//        Assertions.assertEquals("3 * 5 = 15", result);
//    }
}
