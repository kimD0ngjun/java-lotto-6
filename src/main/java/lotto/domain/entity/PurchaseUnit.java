package lotto.domain.entity;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class PurchaseUnit extends Numbers {
    private List<Integer> numbers;

    public PurchaseUnit() {
        this.numbers = generatePurchase();
    }

    // 일치 개수 비교
    public int compareNumbers(List<Integer> lotto) {
        return (int) IntStream.range(0, numbers.size())
                .filter(i -> numbers.contains(lotto.get(i)))
                .count();
    }

    // 구매 단위 번호 생성기
    public List<Integer> generatePurchase () {
        List<Integer> generatedNumbers;
        do {
            generatedNumbers = new ArrayList<>(Randoms.pickUniqueNumbersInRange(1, 45, 6));
        } while (isValidPurchase(generatedNumbers));
        Collections.sort(generatedNumbers);
        return Collections.unmodifiableList(generatedNumbers);
    }

    private boolean isValidPurchase(List<Integer> numbers) {
        try {
            super.isValidNumbers(numbers);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    // for encapsulation and output-view
    @Override
    public List<Integer> getNumbers() {
        return numbers;
    }
}
