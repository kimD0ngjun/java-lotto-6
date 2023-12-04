package lotto.utility;

import lotto.view.message.ErrorMessage;

public class PurchaseValidator {
    public static void isValidPurchase(int input) {
        isRangeInteger(input);
        isThousandsUnit(input);
    }

    private static final int MIN_PURCHASE = 1_000;

    private static void isThousandsUnit(int input) {
        if (input % 1_000 != 0 || input < MIN_PURCHASE) {
            throw new IllegalArgumentException(ErrorMessage.UNIT_VIOLATION.getMessage());
        }
    }
    private static final int MAX_PURCHASE = 2_147_483_000;

    private static void isRangeInteger(int input) {
        if (input > MAX_PURCHASE) {
            throw new IllegalArgumentException(ErrorMessage.RANGE_OVER_VIOLATION.getMessage());
        }
    }
}
