package lotto.utility;

import lotto.view.message.ErrorMessage;

public class PurchaseValidator {
    public static void isValidPurchase(int input) {
        isThousandsUnit(input);
    }

    private static void isThousandsUnit(int input) {
        if (input % 1_000 != 0) {
            throw new IllegalArgumentException(ErrorMessage.UNIT_VIOLATION.getMessage());
        }
    }
}
