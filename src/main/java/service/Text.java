package service;

public enum Text {

    INITIALISATION("Please, provide 2 arguments, natural numbers only"),
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
