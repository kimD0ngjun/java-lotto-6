package lotto.controller;


import static lotto.controller.PurchaseController.generateAndPrintLottoNumbers;

import java.util.List;

public class MainController {
    private List<List<Integer>> purchaseList;

    public void startLotto() {
        InputController inputController = new InputController();

        int count = inputController.getInputPurchase() / 1_000;

        generateAndPrintLottoNumbers(count);


        List<Integer> lotto = inputController.getInputLotto();
        int bonus = inputController.getInputBonus(lotto);
    }
}
