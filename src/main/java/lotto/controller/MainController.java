package lotto.controller;


import static lotto.controller.PrintController.generateAndPrintLottoNumbers;

import java.util.List;
import lotto.view.message.OutputMessage;

public class MainController {
    private List<List<Integer>> purchaseList;

    public void startLotto() {
        InputController inputController = new InputController();

        int amount = inputController.getInputPurchase();

        int count = amount / 1_000;

        generateAndPrintLottoNumbers(count);






        List<Integer> lotto = inputController.getInputLotto();
        int bonus = inputController.getInputBonus(lotto);
    }
}
