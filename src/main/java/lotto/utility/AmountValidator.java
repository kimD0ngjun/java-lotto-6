package lotto.utility;

import lotto.view.message.ErrorMessage;

public class AmountValidator {
    public static void isValidAmount(int input) {
        isRangeInteger(input);
        isThousandsUnit(input);
    }

    private static final int MIN_AMOUNT = 1_000;

    private static void isThousandsUnit(int input) {
        if (input % 1_000 != 0 || input < MIN_AMOUNT) {
            throw new IllegalArgumentException(ErrorMessage.UNIT_VIOLATION.getMessage());
        }
    }
    private static final int MAX_AMOUNT = 2_147_483_000;

    private static void isRangeInteger(int input) {
        if (input > MAX_AMOUNT) {
            throw new IllegalArgumentException(ErrorMessage.RANGE_OVER_VIOLATION.getMessage());
        }
    }
}
