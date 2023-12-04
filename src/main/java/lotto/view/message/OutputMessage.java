package lotto.view.message;

public enum OutputMessage {
    OUTPUT_MESSAGE("메시지를 작성하세요."),
    FORMAT_MESSAGE_STRING("이름 : %d"),
    FORMAT_MESSAGE_NUMBER("개수 : %s개"),
    FORMAT_MESSAGE_STRING_NUMBER("이름 : %d\n개수 : %s개");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    // 메소드 오버로딩 활용
    public String getMessage(int number) {
        return String.format(message, number);
    }

    public String getMessage(String string) {
        return String.format(message, string);
    }

    public String getMessage(String menuName, int menuQuantity) {
        return String.format(message, menuName, menuQuantity);
    }
}
