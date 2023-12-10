package lotto.service;

import java.util.ArrayList;
import java.util.List;
import lotto.domain.entity.Purchase;

public class PurchaseService {
    private List<Purchase> purchaseList;

    public PurchaseService(int count) {
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

    // for output-view
    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }
}
