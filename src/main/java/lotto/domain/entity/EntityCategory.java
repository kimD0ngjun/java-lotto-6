package lotto.domain.entity;

// 만약 메뉴 같이 카테고리가 정해진 경우 써먹기
public enum EntityCategory {
    UNIT1("입력단위1", 1, Category.CATEGORY1),
    UNIT2("입력단위2", 2, Category.CATEGORY2),
    UNIT3("입력단위3", 3, Category.CATEGORY3);

    private final String name;
    private final int number;
    private final Category entityCategory;

    EntityCategory(String name, int number, Category entityCategory) {
        this.name = name;
        this.number = number;
        this.entityCategory = entityCategory;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Category getEntityCategory() {
        return entityCategory;
    }

    public static boolean isCategoryByName(String name) {
        for (EntityCategory menu : values()) {
            if (menu.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // 내부 private 말고 별도로 클래스 분리하는 것도 고려하기
    private enum Category {
        CATEGORY1,
        CATEGORY2,
        CATEGORY3;
    }
}
