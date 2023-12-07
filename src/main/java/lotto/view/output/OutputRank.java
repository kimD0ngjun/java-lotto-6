package lotto.view.output;

import java.util.List;
import lotto.view.message.OutputMessage;

public class OutputRank {
    public void outputValue(List<Integer> resultList) {
        System.out.println(OutputMessage.RANK_MESSAGE.getMessage());
        System.out.println(OutputMessage.MATCHING.getMessage(
                resultList.get(0),
                resultList.get(1),
                resultList.get(2),
                resultList.get(3),
                resultList.get(4)));
    }
}
