package lotto.controller;


import java.util.List;
import lotto.domain.entity.Lotto;
import lotto.service.WinningService;
import lotto.view.message.WinningCategory;
import lotto.view.output.OutputRank;

public class MainController {
    private List<List<Integer>> purchaseList;

    public void startLotto() {
        InputController inputController = new InputController();

        OutputController outputController = OutputController.getInstance();

        int count = inputController.getInputPurchase() / 1_000;

        outputController.printPurchaseList(count);




        List<Integer> lottoValue = inputController.getInputLotto();
        Lotto lotto = new Lotto(lottoValue);
        int bonus = inputController.getInputBonus(lottoValue);

        WinningService winningService = new WinningService();

        OutputRank outputRank = new OutputRank();
        outputRank.outputValue(winningService.updateWinningList(lotto, bonus));
    }
}
