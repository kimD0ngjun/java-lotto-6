package lotto.view.output;

import java.util.List;
import lotto.domain.entity.Lotto;
import lotto.service.WinningService;

public interface Output {
    void outputValue(WinningService winning, Lotto lotto, int bonus);
}
