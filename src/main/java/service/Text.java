package service;

public enum Text {

    ENTER_FIRST_ARG("Please, provide first argument, natural number only"),
    ENTER_SECOND_ARG("Please, provide second argument, natural number only"),
    ENTER_OPERATOR("Please, enter operator (+, *, -, /, %):"),
    RESULT_OUTPUT("Result: ");

    private final String text;

    Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
