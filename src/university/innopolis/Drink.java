package university.innopolis;

public enum Drink {
    COFFEE(20, 1), MILK(25, 2), CHICORY(35, 3), WATER(30, 4), JUICE(40, 5);

    private String title;
    private int cost;
    private int num;

    Drink(String title, int cost) {
        this.title = title;
        this.num = ordinal();
    }

    Drink(int cost, int num) {
        this.title = name();
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
}
