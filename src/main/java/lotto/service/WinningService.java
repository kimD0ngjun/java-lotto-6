package lotto.service;

import java.util.ArrayList;
import java.util.List;
import lotto.controller.OutputController;
import lotto.domain.entity.Lotto;
import lotto.domain.entity.Purchase;
import lotto.view.message.OutputMessage;
import lotto.view.message.WinningCategory;

public class WinningService {
    private List<Purchase> purchaseList = new ArrayList<>();

    // 구매 목록 업데이트(출력용)
    public void updatePurchaseList(int count) {
        for(int i = 0; i < count; i++) {
            Purchase purchase = new Purchase();
            purchaseList.add(purchase);
        }
    }

    // 등수 반환
    public List<Integer> updateWinningList(Lotto lotto, int bonus) {
        List<Integer> winningList = new ArrayList<>();

        for (int i = 0; i < WinningCategory.values().length; i++) {
            winningList.add(0);
        }
        for (Purchase purchase : purchaseList) {
            int winning = purchase.compareNumbers(lotto);
            if ((winning == 5 && purchase.isContainBonus(bonus)) || winning == 6) {
                winning += 1;
            }
            if (winning  < 3) {
                continue;
            }
            if (winning >= 3 && winning - 3 < winningList.size()) {
                winningList.set(winning - 3, winningList.get(winning - 3) + 1);
            }
        }
        return winningList;
    }
}
