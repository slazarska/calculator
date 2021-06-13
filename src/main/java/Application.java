import service.Calculator;
import service.impl.ConsoleReader;
import service.impl.ConsoleWriter;

public class Application {

    public static void main(String[] args) {
        String result = new Calculator(new ConsoleReader(), new ConsoleWriter()).start();
        System.out.println(result);
    }
}
