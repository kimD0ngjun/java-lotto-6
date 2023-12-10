package lotto.controller;

import lotto.domain.entity.Lotto;
import lotto.domain.entity.Purchase;
import lotto.service.WinningService;
import lotto.utility.TypeValidator;
import lotto.view.message.OutputMessage;
import lotto.view.output.OutputRank;

public class OutputController {
    // 구매 목록 나열
    public static void printPurchaseList(int count, WinningService purchaseList) {
        System.out.println(OutputMessage.PURCHASEE.getMessage(String.valueOf(count)));

        for(Purchase purchase: purchaseList.getPurchaseList()) {
            System.out.println(purchase.getNumbers());
        }

        System.out.println();
    }

    // 등수 반환
    public static void printRank(WinningService winning, Lotto lotto, int bonus) {
        OutputRank outputRank = new OutputRank();
        outputRank.outputValue(winning, lotto, bonus);
    }

    // 당첨금 반환
    public static void printPrize(WinningService winning, Lotto lotto, int bonus, int count) {
        int prize = winning.rankWinning(lotto, 3, bonus) * 5_000 +
                    winning.rankWinning(lotto, 4, bonus) * 50_000 +
                    winning.rankWinning(lotto, 5, bonus) * 1_500_000 +
                    winning.rankWinningWithBonus(lotto, bonus) * 30_000_000 +
                    winning.rankWinning(lotto, 6, bonus) * 2_000_000_000;

        double result = (double) prize / (count * 1_000) * 100;

        String rate = TypeValidator.formatCashPrize(result);

        System.out.println(OutputMessage.RATE.getMessage(rate));
    }
}
