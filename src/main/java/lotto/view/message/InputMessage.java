package lotto.view.message;

public enum InputMessage {
    INPUT_MESSAGE("원하는 메시지를 작성하세요");

    private final String message;

    InputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
