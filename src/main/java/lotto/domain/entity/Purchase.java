package lotto.domain.entity;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Purchase {
    private int amount;

    public Purchase(int amount) {
        this.amount = amount / 1000;
    }

    // 구입 금액만큼 생성 반복하기
    public List<List<Integer>> repeatGenerator() {
        List<List<Integer>> generatedNumbers = new ArrayList<>();
        while (amount > 0) {
            generatedNumbers.add(generateNumbers());
            amount--;
        }
        return generatedNumbers;
    }

    // 로또 번호 생성기
    private List<Integer> generateNumbers() {
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
}
