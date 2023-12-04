package lotto.utility;

import lotto.view.message.ErrorMessage;

public class PurchaseValidator {
    public static void isValidPurchase(String input) {
        isNumberType(input);
        int amount = Integer.parseInt(input);
        isThousandsUnit(amount);
    }

    private static void isNumberType(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.ONLY_NUMBER.getMessage());
        }
    }

    private static void isThousandsUnit(int input) {
        if (input % 1_000 != 0) {
            throw new IllegalArgumentException(ErrorMessage.UNIT_VIOLATION.getMessage());
        }
    }
}
