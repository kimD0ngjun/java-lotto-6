package lotto.view.message;

public enum OutputMessage {
    PURCHASEE("\n%s개를 구매했습니다."),
    RANK_MESSAGE("\n"
            + "당첨 통계\n"
            + "---"),
    MATCHING_THREE("3개 일치 (5,000원) - %d개"),
    MATCHING_FOUR("4개 일치 (50,000원) - %d개"),
    MATCHING_FIVE("5개 일치 (1,500,000원) - %d개"),
    MATCHING_FIVE_WITH_BONUS("5개 일치, 보너스 볼 일치 (30,000,000원) - %d개"),
    MATCHING_SIX("6개 일치 (2,000,000,000원) - %d개"),
    RATE("총 수익률은 %s%%입니다.");

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
}
