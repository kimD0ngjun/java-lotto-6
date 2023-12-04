package lotto.view.input;

import camp.nextstep.edu.missionutils.Console;
import mvc.view.message.InputMessage;


public class Value implements Input {
    @Override
    public String input () {
        InputMessage.INPUT_MESSAGE.getMessage();
        return Console.readLine();
    }
}
