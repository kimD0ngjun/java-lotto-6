package lotto.controller;

import java.util.ArrayList;
import java.util.List;
import lotto.domain.entity.Lotto;
import lotto.domain.entity.Purchase;
import lotto.view.message.OutputMessage;

public class OutputController {
    private static OutputController instance;
    private static List<Purchase> purchaseList = new ArrayList<>();

    // private constructor to prevent instantiation
    private OutputController() {
    }

    public static OutputController getInstance() {
        if (instance == null) {
            instance = new OutputController();
        }
        return instance;
    }

    // 구매 목록 나열
    public static void printPurchaseList(int count) {
        System.out.println(OutputMessage.PURCHASEE.getMessage(String.valueOf(count)));

        for(int i = 0; i < count; i++) {
            Purchase purchase = new Purchase();
            purchaseList.add(purchase);
            System.out.println(purchase.getNumbers());
        }

        System.out.println();
    }

    public static void printWinning(Lotto lotto, int bonus) {
        System.out.println(OutputMessage.WINNING.getMessage());

        for (Purchase purchase: purchaseList) {
            int winning = purchase.compareNumbers(lotto);
            if ((winning == 5 && lotto.isContainBonus(bonus)) || winning == 6) {
                winning += 1;
            }
        }
    }
}
