package lotto.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InitializeResultList {
    public static List<Map<String, Integer>> initializeResultList() {
        List<Map<String, Integer>> resultList = new ArrayList<>();

        String[] categories = {"3개", "4개", "5개", "보너스", "6개"};

        for (String category : categories) {
            Map<String, Integer> categoryMap = new HashMap<>();
            categoryMap.put(category, 0);
            resultList.add(categoryMap);
        }

        return resultList;
    }
}
