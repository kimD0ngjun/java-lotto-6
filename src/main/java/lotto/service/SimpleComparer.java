package lotto.service;

import java.util.List;
import java.util.Map;
import lotto.domain.entity.lotto.Numbers;
import lotto.domain.entity.purchase.Purchase;

public class SimpleComparer implements Comparer {
    private final Purchase purchase;
    private final Numbers numbers;
    private final Number number;
    private List<Map<String, Integer>> resultList;

    public SimpleComparer(Purchase purchase, Numbers numbers, Number number) {
        this.purchase = purchase;
        this.numbers = numbers;
        this.number = number;
    }

    @Override
    public int countSameNumbers() {
        for(List<Integer> purchaseUnit: purchase.repeatGenerator()) {
            numbers.compareNumbers(purchaseUnit);
        }
    }
}
