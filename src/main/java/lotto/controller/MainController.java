package lotto.controller;


import java.util.List;
import lotto.domain.entity.Lotto;

public class MainController {
    private List<List<Integer>> purchaseList;

    public void startLotto() {
        InputController inputController = new InputController();

        OutputController outputController = new OutputController();

        int count = inputController.getInputPurchase() / 1_000;

        outputController.printPurchaseList(count);




        List<Integer> lottoValue = inputController.getInputLotto();
        Lotto lotto = new Lotto(lottoValue);
        int bonus = inputController.getInputBonus(lottoValue);
    }
}
