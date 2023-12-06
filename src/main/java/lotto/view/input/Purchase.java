package lotto.view.input;

import camp.nextstep.edu.missionutils.Console;
import lotto.view.message.InputMessage;


public class Purchase implements Input {
    @Override
    public String inputValue() {
        System.out.println(InputMessage.PURCHASE.getMessage());
        return Console.readLine();
    }
}
