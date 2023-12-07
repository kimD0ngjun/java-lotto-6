package lotto.view.message;

public enum OutputMessage {
    PURCHASEE("\n%s개를 구매했습니다."),
    RANK_MESSAGE("\n"
            + "당첨 통계\n"
            + "---"),
    MATCHING("3개 일치 (5,000원) - %d개\n"
            + "4개 일치 (50,000원) - %d개\n"
            + "5개 일치 (1,500,000원) - %d개\n"
            + "5개 일치, 보너스 볼 일치 (30,000,000원) - %d개\n"
            + "6개 일치 (2,000,000,000원) - %d개"),
    RATE("총 수익률은 %s%%입니다.");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    // 메소드 오버로딩 활용
    public String getMessage(int... args) {
        return String.format(message, args);
    }

    public String getMessage(String string) {
        return String.format(message, string);
    }
}
