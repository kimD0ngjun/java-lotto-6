package lotto.controller;

import java.util.ArrayList;
import java.util.List;
import lotto.domain.entity.Purchase;
import lotto.service.PurchaseService;
import lotto.view.message.OutputMessage;

public class OutputController {
    // 구매 목록 나열
    public void printPurchaseList(int count) {
        System.out.println(OutputMessage.PURCHASEE.getMessage(String.valueOf(count)));

        PurchaseService purchaseList = new PurchaseService(count);

        for(Purchase purchase: purchaseList.getPurchaseList()) {
            System.out.println(purchase);
        }

        System.out.println();
    }

    // 등수 반환
}
