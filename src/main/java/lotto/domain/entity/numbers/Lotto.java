package lotto.domain.entity.numbers;

import java.util.List;

public class Lotto implements Numbers {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현
    @Override
    public int compareNumbers(List<Integer> purchaseUnit) {
        return (int) numbers.stream()
                .filter(purchaseUnit::contains)
                .count(); // long으로 반환되는 걸 강제 타입 변환
    };
}
