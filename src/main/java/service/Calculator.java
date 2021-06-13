package service;

public class Calculator {

    private final Reader reader;
    private final Writer writer;

    public Calculator(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public String start() {
        writer.handleString(Text.ENTER_FIRST_ARG.getText());
        int first = reader.readFirstArg();

        writer.handleString(Text.ENTER_OPERATOR.getText());
        Operation po = reader.readMathOperation();

        writer.handleString(Text.ENTER_SECOND_ARG.getText());
        int second = reader.readSecondArg();

        int result = po.getOperation().invoke(first, second);
        writer.handleString(String.format(Text.RESULT_OUTPUT.getText()));
        String output = "It's " + result;
        return output;
    }
}
