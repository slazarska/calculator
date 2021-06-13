package tests;

import mocks.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.Calculator;
import service.Reader;

public class CalculatorTests {

    private Calculator calculator;
    private Reader mockReader;
    private MockWriter mockWriter;

    @Test
    void calculatorSumTest() {
        mockReader = new MockSumReader();
        mockWriter = new MockWriter();
        calculator = new Calculator(mockReader, mockWriter);
        String result = calculator.start();
        Assertions.assertEquals("1 + 6 = 7", result);
    }

    @Test
    void calculatorSubTest() {
        mockReader = new MockSubReader();
        mockWriter = new MockWriter();
        calculator = new Calculator(mockReader, mockWriter);
        String result = calculator.start();
        Assertions.assertEquals("12 - 8 = 4", result);
    }

    @Test
    void calculatorMultTest() {
        mockReader = new MockMultReader();
        mockWriter = new MockWriter();
        calculator = new Calculator(mockReader, mockWriter);
        String result = calculator.start();
        Assertions.assertEquals("3 * 5 = 15", result);
    }

    @Test
    void calculatorDivTest() {
        mockReader = new MockDivReader();
        mockWriter = new MockWriter();
        calculator = new Calculator(mockReader, mockWriter);
        String result = calculator.start();
        Assertions.assertEquals("10 / 5 = 2", result);
    }

    @Test
    void calculatorZeroDivTest() {
        mockReader = new MockDivByZeroReader();
        mockWriter = new MockWriter();
        calculator = new Calculator(mockReader, mockWriter);
        Exception caughtException = null;
        try {
            calculator.start();
        } catch (Exception e) {
            caughtException = e;
        }
        Assertions.assertEquals("Error! Dividing by zero is not allowed.", caughtException.getMessage());
    }

    @Test
    void calculatorModuleDivTest() {
        mockReader = new MockModuleDivReader();
        mockWriter = new MockWriter();
        calculator = new Calculator(mockReader, mockWriter);
        String result = calculator.start();
        Assertions.assertEquals("10 % 3 = 1", result);
    }

    @Test
    void moduleDivByZeroTest() {
        mockReader = new MockModuleDivByZeroReader();
        mockWriter = new MockWriter();
        calculator = new Calculator(mockReader, mockWriter);
        Exception caughtException = null;
        try {
            calculator.start();
        } catch (Exception e) {
            caughtException = e;
        }
        Assertions.assertEquals("Error! Dividing by zero is not allowed.", caughtException.getMessage());
    }

    @Test
    void calculatorPowTest() {
        mockReader = new MockPowReader();
        mockWriter = new MockWriter();
        calculator = new Calculator(mockReader, mockWriter);
        String result = calculator.start();
        Assertions.assertEquals("2 ^ 7 = 128", result);
    }
}
