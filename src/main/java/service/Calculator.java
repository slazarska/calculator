package service;

public class Calculator {

    private final Reader reader;
    private final Writer writer;

    public Calculator(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public String start() {
        writer.handleString(Text.INITIALISATION.getText());
        int first = reader.readFirstArg();
        int second = reader.readSecondArg();
        writer.handleString(Text.ENTER_OPERATOR.getText());
        Operation po = reader.readMathOperation();
        int result = po.getOperation().invoke(first, second);

        String output = first + " " + po.getSymbol() + " " + second + " = " + result;
        writer.handleString(String.format(Text.RESULT_OUTPUT.getText(), output));
        return output;
    }
}
