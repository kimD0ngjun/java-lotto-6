package lotto.domain.entity;

import java.util.ArrayList;
import java.util.List;
import lotto.service.PurchaseNumbersGenerator;

public class SimplePurchase implements Purchase {
    private int amount;
    private final PurchaseNumbersGenerator lottoGenerator;

    public SimplePurchase(int amount, PurchaseNumbersGenerator lottoGenerator) {
        this.amount = amount / 1000;
        this.lottoGenerator = lottoGenerator;
    }

    // 구입 금액만큼 생성 반복하기
    public List<List<Integer>> repeatGenerator() {
        List<List<Integer>> generatedNumbers = new ArrayList<>();
        while (amount > 0) {
            generatedNumbers.add(lottoGenerator.generateNumbers());
            amount--;
        }
        return generatedNumbers;
    }
}
