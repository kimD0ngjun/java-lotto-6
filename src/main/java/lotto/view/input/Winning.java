package lotto.view.input;

import camp.nextstep.edu.missionutils.Console;
import lotto.view.message.InputMessage;

public class Winning implements Input {
    @Override
    public String input () {
        InputMessage.WINNING.getMessage();
        return Console.readLine();
    }
}
