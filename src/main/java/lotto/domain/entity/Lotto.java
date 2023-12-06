package lotto.domain.entity;

import java.util.List;
import java.util.stream.IntStream;

public class Lotto extends Numbers {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        super.isValidNumbers(numbers);
        this.numbers = numbers;
    }

    // 이제 이걸 구입 금액 비례 뺑뺑이 돌리기
    public int countSameNumber(List<Integer> purchase) {
        return (int) IntStream.range(0, purchase.size())
                .filter(i -> numbers.contains(purchase.get(i)))
                .count();
    }
}