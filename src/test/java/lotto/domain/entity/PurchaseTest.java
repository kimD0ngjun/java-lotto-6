package lotto.domain.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PurchaseTest {
    // 테스트용 MockPurchase 클래스
    private static class MockPurchase extends Purchase {
        @Override
        public List<Integer> generatePurchase() {
            return Arrays.asList(1, 2, 3, 4, 5, 6);
        }
    }

    @DisplayName("List 타입의 일련번호를 받아서 일치 개수를 반환한다.")
    @Test
    void testCounting() {
        Purchase mockPurchase = new MockPurchase();

        List<Integer> testCase1 = Arrays.asList(1, 2, 6, 4, 2, 3);
        List<Integer> testCase2 = Arrays.asList(1, 2, 7, 8, 10, 41);

        assertEquals(6, mockPurchase.compareNumbers(testCase1));
        assertEquals(2, mockPurchase.compareNumbers(testCase2));
    }
}
