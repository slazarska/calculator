package service.impl;

import service.Operation;
import service.Reader;

import java.util.Scanner;

public class ConsoleReader implements Reader {

    private Scanner reader = new Scanner(System.in);

    @Override
    public int readFirstArg() {
        return reader.nextInt();
    }

    @Override
    public int readSecondArg() {
        return reader.nextInt();
    }

    @Override
    public Operation readMathOperation() {
        return Operation.lookup(reader.next().charAt(0));
    }


}
