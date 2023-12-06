package lotto.controller;

import java.util.ArrayList;
import java.util.List;
import lotto.domain.entity.PurchaseUnit;
import lotto.view.message.OutputMessage;

public class PurchaseController {
    private static List<PurchaseUnit> purchaseList = new ArrayList<>();

    // private constructor to prevent instantiation
    private PurchaseController() {
    }

    public static void generateAndPrintLottoNumbers(int count) {
        System.out.println(OutputMessage.PURCHASEE.getMessage(String.valueOf(count)));

        for(int i = 0; i < count; i++) {
            PurchaseUnit purchase = new PurchaseUnit();
            purchaseList.add(purchase);
            System.out.println(purchase.getNumbers());
        }

        System.out.println();
    }
}
