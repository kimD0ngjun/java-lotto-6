package lotto.utility;

import java.util.List;
import lotto.view.message.ErrorMessage;

public class NumbersValidator {
    public static void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(ErrorMessage.SIX_TIMES.getMessage());
        }
    }
}
