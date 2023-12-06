package lotto.view.input;

import camp.nextstep.edu.missionutils.Console;
import lotto.view.message.InputMessage;

public class Lotto implements Input {
    @Override
    public String inputValue() {
        System.out.println(InputMessage.WINNING.getMessage());
        return Console.readLine();
    }
}
