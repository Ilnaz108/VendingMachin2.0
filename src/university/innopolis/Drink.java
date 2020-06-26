package university.innopolis;

public enum Drink {
    COFFEE, MILK, CHICORY, WATER, JUICE;

    private String title;

    Drink(String title, int cost) {
        this.title = title;
    }

    Drink() {

    }
}
