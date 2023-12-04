package lotto.utility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lotto.view.message.ErrorMessage;

public class TypeChanger {

    // 쉼표를 구분자로 List 반환하는 메소드
    public static List<Integer> splitAndParseInt(String input) {
        try {
            return Arrays.stream(input.split(","))
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.ONLY_NUMBER.getMessage());
        }
    }

    // 세 자리마다 숫자에 쉼표를 붙이는 메소드
    private static final String CASH_PRIZE_REGEX = "\\B(?=(\\d{3})+(?!\\d))";
    private static final String COMMA_REGEX = ",";

    public static String formatCashPrize(int cashPrize) {
        return String.valueOf(cashPrize).replaceAll(CASH_PRIZE_REGEX, COMMA_REGEX);
    }
}
