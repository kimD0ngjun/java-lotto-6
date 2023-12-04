package lotto.view.message;

public enum ErrorMessage {
    ERROR("[ERROR] "),
    ERROR_MESSAGE("에러 메시지를 입력하세요."),
    ANOTHER_ERROR_MESSAGE("또다른 에러 케이스");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return ERROR.message + message;
    }
}
