package tests;

import mocks.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.Calculator;
import service.Reader;
import org.assertj.core.api.SoftAssertions;
import service.Text;

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

//    @Test
//    void calculatorZeroDivTest() {
//        mockReader = new MockZeroDivReader();
//        mockWriter = new MockWriter();
//        calculator = new Calculator(mockReader, mockWriter);
//        Exception caughtException = null;
//        try {
//            calculator.start();
//        }catch (Exception e){
//            caughtException = e;
//        }
//        Assertions.assertEquals("ZeroDivisionError", caughtException.getMessage());
//    }

    @Test
    void calculatorModuleDivTest() {
        mockReader = new MockModuleDivReader();
        mockWriter = new MockWriter();
        calculator = new Calculator(mockReader, mockWriter);
        String result = calculator.start();
        Assertions.assertEquals("10 % 3 = 1", result);
    }

    @Test
    void checkAllMessages() {
        mockReader = new MockMultReader();
        mockWriter = new MockWriter();
        calculator = new Calculator(mockReader, mockWriter);
        String result = calculator.start();

        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(mockWriter.handleString(Text.INITIALISATION.getText()))
                .isEqualTo("Please, provide 2 arguments, natural numbers only");
        softAssertions.assertThat(mockWriter.handleString(Text.ENTER_OPERATOR.getText()))
                .isEqualTo("\"Please, enter operator (+, *, -, /, %):\"");
        softAssertions.assertThat(String.format(Text.RESULT_OUTPUT.getText(), result))
                .isEqualTo("Result: ");
        softAssertions.assertAll();
    }
}
