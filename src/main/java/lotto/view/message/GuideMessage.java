package lotto.view.message;

public enum GuideMessage {
    PURCHASE("구입금액을 입력해 주세요."),
    INPUT_MESSAGE("구입금액을 입력해 주세요.");

    private final String message;

    GuideMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
