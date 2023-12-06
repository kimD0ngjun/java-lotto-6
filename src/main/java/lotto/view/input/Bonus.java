package lotto.view.input;

import camp.nextstep.edu.missionutils.Console;
import lotto.view.message.InputMessage;

public class Bonus implements Input {
    @Override
    public String inputValue() {
        InputMessage.BONUS.getMessage();
        return Console.readLine();
    }
}
