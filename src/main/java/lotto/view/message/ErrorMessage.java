package lotto.view.message;

public enum ErrorMessage {
    ERROR("[ERROR] "),
    ONLY_NUMBER("숫자만 입력할 수 있습니다."),
    UNIT_VIOLATION("1,000원 단위로 입력해야 합니다."),
    RANGE_OVER_VIOLATION("과도한 구입은 패가망신의 지름길입니다."),
    SIX_TIMES("당첨 번호는 총 6번 입력해야 합니다."),
    RANGE("1부터 45까지만 입력해야 합니다."),
    DUPLICATES("중복된 숫자를 입력할 수 없습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return ERROR.message + message;
    }
}
