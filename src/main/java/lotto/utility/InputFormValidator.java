package lotto.utility;


import lotto.view.message.ErrorMessage;

public class InputFormValidator {

    // 입력값 공백 여부 유효성 검증
    public static void splitByComma(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException(ErrorMessage.ONLY_NUMBER.getMessage());
        }
    }

    // 입력값이 숫자인지 여부 유효성 검증
    public static void isNumberType(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.ONLY_NUMBER.getMessage());
        }
    }

    // 입력값(단위 요소)에 공백이 포함됐는지 여부 유효성 검증
    private static final String INCLUDE_SPACES = ".*\\s+.*";

    public static void containsWhitespace(String input) {
        if (input.matches(INCLUDE_SPACES)) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_MESSAGE.getMessage());
        }
    }

    // 입력값(단위 요소)가 공백, 특수문자, 숫자 등 전부 빼고 오로지 문자만 포함됐는지 유효성 검증
    // 오직 한글만
    private static final String KOREAN_PATTERN = "^[가-힣]*$";
    // 오직 영어만
    private static final String ALPHABET_PATTERN = "^[a-zA-Z]*$";
    // 한글과 영어 혼용
    private static final String CHARACTER_PATTERN = "^[a-zA-Z가-힣]*$";
    // 한글, 영어, 숫자(즉 쉼표 점 같은 특수문자들 배제)
    private static final String NON_SPECIAL_CHARACTER_PATTERN = "^[a-zA-Z가-힣0-9]*$";

    public static void isValidKorean(String input) {
        if (input.matches(KOREAN_PATTERN)) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_MESSAGE.getMessage());
        }
    }


    // 제시된 도메인 카테고리 열거형에 입력값 단위가 포함됐는지 여부 판별
    public static void isIncludedInCategory(String name) {
        if (EntityCategory.isCategoryByName(name)) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_MESSAGE.getMessage());
        }
    }
}
