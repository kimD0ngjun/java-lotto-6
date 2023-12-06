package lotto.domain.entity;

import java.util.List;

public class Lotto extends Numbers {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        super.isValidNumbers(numbers);
        this.numbers = numbers;
    }

    // 이제 이걸 구입 금액 비례 뺑뺑이 돌리기
    public int countSameNumber(PurchaseUnit purchaseUnit) {
        return purchaseUnit.compareNumbers(numbers);
    }
}