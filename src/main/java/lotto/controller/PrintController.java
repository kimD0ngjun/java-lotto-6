package lotto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import lotto.domain.entity.Numbers;
import lotto.domain.entity.PurchaseUnit;
import lotto.view.message.OutputMessage;

public class PrintController {
    private static List<List<Integer>> purchaseList = new ArrayList<>();



    public static void generateAndPrintLottoNumbers(int count) {
        System.out.println(OutputMessage.PURCHASEE.getMessage(String.valueOf(count)));

        for(int i = 0; i < count; i++) {
            Numbers purchase = new PurchaseUnit();
            System.out.println(purchase.getNumbers());
        }


        System.out.println();
    }
}
