package service;

public enum Text {

    INITIALISATION("Please, provide arguments"),
    ENTER_OPERATOR("Please, enter operator (+, *, -, /, %):"),
    RESULT_OUTPUT("Result: %s");

    private final String text;

    Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
