package lotto.service;

import java.util.ArrayList;
import java.util.List;
import lotto.domain.entity.Lotto;
import lotto.domain.entity.Purchase;

public class WinningService {
    private List<Purchase> purchaseList;

    public WinningService(int count) {
        this.purchaseList = updatePurchaseList(count);
    }

    // 구매 목록 업데이트
    public List<Purchase> updatePurchaseList(int count) {
        List<Purchase> purchaseList = new ArrayList<>();

        for(int i = 0; i < count; i++) {
            Purchase purchase = Purchase.createRandomPurchase();
            purchaseList.add(purchase);
        }

        return purchaseList;
    }

    // 랭킹 매기기
    public int rankWinning(Lotto lotto, int sameCount, int bonus) {
        int count = 0;

        for(Purchase purchase: purchaseList) {
            if (purchase.compareNumbers(lotto) == sameCount && !purchase.isContainBonus(bonus)) {
                count ++;
            }
        }

        return count;
    }

    // 보너스 일치 여부
    public int rankWinningWithBonus(Lotto lotto, int bonus) {
        int count = 0;

        for(Purchase purchase: purchaseList) {
            if (purchase.compareNumbers(lotto) == 5 && purchase.isContainBonus(bonus)) {
                count ++;
            }
        }

        return count;
    }

    // for output-view
    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }
}
