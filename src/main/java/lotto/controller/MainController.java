package lotto.controller;


import java.util.List;
import lotto.domain.entity.Lotto;
import lotto.service.WinningService;

public class MainController {
    private List<List<Integer>> purchaseList;

    public void startLotto() {
        InputController inputController = new InputController();

        int count = inputController.getInputPurchase() / 1_000;

        WinningService purchaseList = new WinningService(count);

        OutputController.printPurchaseList(count, purchaseList);




        List<Integer> lottoValue = inputController.getInputLotto();
        Lotto lotto = new Lotto(lottoValue);
        int bonus = inputController.getInputBonus(lottoValue);

        OutputController.printRank(purchaseList, lotto, bonus);
        OutputController.printPrize(purchaseList, lotto, bonus, count);
    }
}
