package lotto.view.message;

public enum WinningCategory {
    THREE_MATCH(5_000),
    FOUR_MATCH(50_000),
    FIVE_MATCH(1_500_000),
    FIVE_MATCH_BONUS(30_000_000),
    SIX_MATCH(2_000_000_000);

    private final int prize;

    WinningCategory(int prize) {
        this.prize = prize;
    }
    public int getPrize() {
        return prize;
    }
}
