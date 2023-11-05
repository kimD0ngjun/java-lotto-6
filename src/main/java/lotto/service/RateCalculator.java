package lotto.service;

import java.util.List;

public class RateCalculator {
    // 당첨금 계산기
    private static int calculateWinnings(List<Integer> resultList) {
        return 5000 * resultList.get(0) + 50000 * resultList.get(1) + 1500000 * resultList.get(2) + 30000000 * resultList.get(3) + 2000000000 * resultList.get(4);
    }

    // 수익률 계산기
    public static double calculateRate(int purchaseAmount, List<Integer> resultList) {
        double profitPercentage = (double) calculateWinnings(resultList) / purchaseAmount * 100;
        return Math.round(profitPercentage * 10.0) / 10.0;
    }
}
