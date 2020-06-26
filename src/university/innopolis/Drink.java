package university.innopolis;

public enum Drink {
    COFFEE(1), MILK(2), CHICORY(3), WATER(4), JUICE(5);

    private String title;

    Drink(String title, int cost) {this.title = title;
    }

    Drink(int cost) {
    }

    public String getTitle(){
        return title;
    }
}
