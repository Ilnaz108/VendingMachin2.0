package university.innopolis;

public enum Drink {
    COFFEE(20, 1, "Кофе"), MILK(25, 2, "Молоко"), CHICORY(35, 3, "Цикорий"),
    WATER(30, 4, "Вода"), JUICE(40, 5, "Сок");

    private int cost;
    private int num;
    private String title;


    Drink(int cost, int num, String title) {
        this.title = title;
        this.num = num;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public int getCost() {
        return cost;
    }

    public int getNum() {
        return num;
    }

    public static String getNameByNumber(int num){
        for (Drink value : Drink.values()) {
            if (num == value.getNum()) {
                return value.getTitle();
            }
        }
        return null;
    }
}
