package lotto.controller;


import java.util.List;

public class MainController {
    private List<List<Integer>> purchaseList;

    public void startLotto() {
        InputController inputController = new InputController();

        OutputController outputController = OutputController.getInstance();

        int count = inputController.getInputPurchase() / 1_000;

        outputController.printPurchaseList(count);


        List<Integer> lotto = inputController.getInputLotto();
        int bonus = inputController.getInputBonus(lotto);
    }
}
