package lotto.utility;

import lotto.view.message.ErrorMessage;

public class PurchaseValidator {
    public static void isNumberType(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.ONLY_NUMBER.getMessage());
        }
    }
}
