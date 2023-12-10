package lotto.view.output;

import java.util.List;
import lotto.domain.entity.Lotto;
import lotto.service.WinningService;
import lotto.view.message.OutputMessage;

public class OutputRank {
    public void outputValue(WinningService winning, Lotto lotto) {
        System.out.println(OutputMessage.RANK_MESSAGE.getMessage());
        System.out.println(OutputMessage.MATCHING_THREE.getMessage(winning.rankWinning(lotto, 3)));
        System.out.println(OutputMessage.MATCHING_FOUR.getMessage(winning.rankWinning(lotto, 4)));
        System.out.println(OutputMessage.MATCHING_FIVE.getMessage(winning.rankWinning(lotto, 5)));
        System.out.println(OutputMessage.MATCHING_SIX.getMessage(winning.rankWinning(lotto, 6)));
    }
}
