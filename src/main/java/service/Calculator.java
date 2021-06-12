package service;

public class Calculator {

    private final Reader reader;
    private final Writer writer;

    public Calculator(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public String start() {
        System.out.println("Please provide first argument");
        System.out.print("Введите два числа: ");
        int first = reader.readFirstArg();
        int second = reader.readSecondArg();
        System.out.print("Введите оператор (+, *, - , /): ");
        Operation po = reader.readMathOperation();
        int sum = po.getOperation().invoke(first, second);
        System.out.print("\nРезультат:\n");
        return first + " " + po.getSymbol() + " " + second + " = " + sum;
    }
}
