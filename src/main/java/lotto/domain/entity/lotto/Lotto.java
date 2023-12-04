package lotto.domain.entity.lotto;

import java.util.List;
import lotto.utility.NumberValidator;

public class Lotto implements Numbers {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        NumberValidator.isValidLotto(numbers);
        this.numbers = numbers;
    }

    @Override
    public int compareNumbers(List<Integer> purchaseUnit) {
        return (int) numbers.stream()
                .filter(purchaseUnit::contains)
                .count(); // long으로 반환되는 걸 강제 타입 변환
    };
}
