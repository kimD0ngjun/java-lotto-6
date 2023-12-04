package lotto.domain.entity;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lotto.service.LottoGenerator;

public class Purchase {
    private int amount;
    private final LottoGenerator lottoGenerator;

    public Purchase(int amount, LottoGenerator lottoGenerator) {
        this.amount = amount / 1000;
        this.lottoGenerator = lottoGenerator;
    }

    // 구입 금액만큼 생성 반복하기
    public List<List<Integer>> repeatGenerator() {
        List<List<Integer>> generatedNumbers = new ArrayList<>();
        while (amount > 0) {
            generatedNumbers.add(lottoGenerator.generateNumbers());
            amount--;
        }
        return generatedNumbers;
    }
}
