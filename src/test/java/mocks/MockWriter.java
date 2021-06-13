package mocks;

import service.Writer;

public class MockWriter implements Writer {

    @Override
    public String handleString(String output) {
        return output;
    }
}
