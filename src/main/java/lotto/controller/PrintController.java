package lotto.controller;

import java.util.ArrayList;
import java.util.List;
import lotto.domain.entity.Numbers;
import lotto.domain.entity.PurchaseUnit;
import lotto.view.message.OutputMessage;

public class PrintController {
    private static List<PurchaseUnit> purchaseList = new ArrayList<>();

    public static void generateAndPrintLottoNumbers(int count) {
        System.out.println(OutputMessage.PURCHASEE.getMessage(String.valueOf(count)));

        for(int i = 0; i < count; i++) {
            PurchaseUnit purchase = new PurchaseUnit();
            purchaseList.add(purchase);
            System.out.println(purchase.getNumbers());
        }
    }
}
