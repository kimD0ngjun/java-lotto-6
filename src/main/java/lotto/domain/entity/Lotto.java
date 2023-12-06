package lotto.domain.entity;

import java.util.List;
import java.util.stream.IntStream;
import lotto.utility.NumbersValidator;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        NumbersValidator.isValidLotto(numbers);
        this.numbers = numbers;
    }

    // 당첨 번호와 일치하는 번호 개수 반환
    public int countSameNumber(List<Integer> purchase) {
        return (int) IntStream.range(0, purchase.size())
                .filter(i -> numbers.contains(purchase.get(i)))
                .count();
    }

    // 보너스 번호 포함됐는지 여부
    public boolean isContainBonus(int bonus) {
        if (numbers.contains(bonus)) {
            return true;
        }
        return false;
    }
}