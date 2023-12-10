package lotto.controller;

import lotto.domain.entity.Lotto;
import lotto.domain.entity.Purchase;
import lotto.service.WinningService;
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
}
