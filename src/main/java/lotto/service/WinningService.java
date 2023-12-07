package lotto.service;

import java.util.ArrayList;
import java.util.List;
import lotto.controller.OutputController;
import lotto.domain.entity.Lotto;
import lotto.domain.entity.Purchase;
import lotto.view.message.OutputMessage;

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
    public int getRank(Lotto lotto, int bonus) {
        for (Purchase purchase: purchaseList) {
            int winning = purchase.compareNumbers(lotto);
            if ((winning == 5 && lotto.isContainBonus(bonus)) || winning == 6) {
                winning += 1;
            }
        }
    }
}
