package lotto.domain.entity;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Purchase {
    private List<Integer> numbers;

    public Purchase() {
        this.numbers = generatePurchase();
    }

    // 일치 개수 비교
    public int compareNumbers(Lotto lotto) {
        return lotto.countSameNumber(numbers);
    }

    // 구매 단위 번호 생성기
    public List<Integer> generatePurchase () {
        List<Integer> numbers;
        do {
            numbers = new ArrayList<>(Randoms.pickUniqueNumbersInRange(1, 45, 6));
        } while (hasDuplicates(numbers));
        Collections.sort(numbers);
        return Collections.unmodifiableList(numbers);
    }

    private boolean hasDuplicates(List<Integer> numbers) {
        Set<Integer> set = new HashSet<>();
        for (int num : numbers) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    // 보너스 번호 포함됐는지 여부
    public boolean isContainBonus(int bonus) {
        if (numbers.contains(bonus)) {
            return true;
        }
        return false;
    }

    // for encapsulation and output-view
    public List<Integer> getNumbers() {
        return numbers;
    }
}
