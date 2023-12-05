package lotto.domain.entity;

import java.util.List;
import lotto.utility.NumbersValidator;

public class Numbers {
    // 유효성 검사를 인터페이스화 시켜서 결합도를 낮추는 것이 좀 더 객체지향적인 관점이나,
    // 미션 언급사항인 Lotto의 필드 추가 불가능 떄문에 우선은 패스
    public void isValidNumbers(List<Integer> numbers) {
        NumbersValidator.validateLength(numbers);
        NumbersValidator.validateUnitRange(numbers);
        NumbersValidator.validateDuplicates(numbers);
    }
}
