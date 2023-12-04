package lotto.view.input;

import camp.nextstep.edu.missionutils.Console;
import lotto.view.message.InputMessage;
import mvc.view.message.InputMessage;


public class Value implements Input {
    @Override
    public String input () {
        InputMessage.PURCHASE.getMessage();
        return Console.readLine();
    }
}
