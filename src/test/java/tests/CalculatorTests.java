package tests;

import mocks.MockMultReader;
import mocks.MockWriter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.Calculator;
import service.Reader;
import service.Writer;

public class CalculatorTests {

    private Calculator calculator;
    private Reader mockReader;
    private Writer mockWriter;

    @Test
    void calculatorMultTest() {
        mockReader = new MockMultReader();
        mockWriter = new MockWriter();
        calculator = new Calculator(mockReader, mockWriter);
        String result = calculator.start();
        Assertions.assertEquals("3 * 5 = 15", result);
    }
}
