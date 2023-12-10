package lotto.service;

import lotto.domain.entity.Lotto;
import lotto.domain.entity.Purchase;

public class WinningService {
    public int rankWinning(Lotto lotto, Purchase purchase) {
        return purchase.compareNumbers(lotto);
    }
}
