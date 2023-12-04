package lotto.domain.entity.numbers;

import java.util.List;
import lotto.utility.NumberValidator;

public class Lotto implements Number {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        NumberValidator.isValid(numbers);
        this.numbers = numbers;
    }

    // TODO: 추가 기능 구현
    @Override
    public int compareNumbers(List<Integer> purchaseUnit) {
        return (int) numbers.stream()
                .filter(purchaseUnit::contains)
                .count(); // long으로 반환되는 걸 강제 타입 변환
    };
}
