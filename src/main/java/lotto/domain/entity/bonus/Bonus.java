package lotto.domain.entity.bonus;

import java.util.List;
import lotto.domain.entity.lotto.Numbers;
import lotto.utility.NumberValidator;

public class Bonus implements Number {
    private static final int RANK_INCREASE = 1;
    private final int bonus;

    public Bonus(int bonus) {
        NumberValidator.validateRange(bonus);
        this.bonus = bonus;
    }

    @Override
    public int compareNumber(List<Integer> purchaseUnit) {
        if (purchaseUnit.contains(bonus)) {
            return RANK_INCREASE;
        }
        return 0;
    }
}
