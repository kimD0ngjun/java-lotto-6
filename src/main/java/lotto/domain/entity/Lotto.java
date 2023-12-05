package lotto.domain.entity;

import java.util.List;

public class Lotto extends Numbers {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        super.isValidNumbers(numbers);
        this.numbers = numbers;
    }

    public int countSameNumber(Purchase purchase) {
        return purchase.compareNumbers(numbers);
    }
}