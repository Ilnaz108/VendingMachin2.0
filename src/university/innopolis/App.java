package university.innopolis;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Enum.*;

public class App {


    public static void main(String[] args) {
        System.out.println("Что вы хотите:\n" +
                "1 - Посмотреть меню напитков\n" +
                "2 - Внести деньги на внутренний счет\n" +
                "3 - Выбрать номер напитка и получить его\n" +
                "Внимание! Автомат сдачи не выдает");
        Scanner scanner = new Scanner(System.in);
        int result;
        int type1 = scanner.nextInt();
        String next;
        String str = "Drink";
        switch (type1) {
            case 1: {
                Drink drink1 = Drink.CHICORY;
                Drink drink2 = Drink.COFFEE;
                Drink drink3 = Drink.JUICE;
                Drink drink4 = Drink.MILK;
                Drink drink5 = Drink.WATER;
                System.out.println(Arrays.toString(Drink.values()));
                break;
            }
            case 2: {
                System.out.println("Внесите купюру на внутренний счет");
                int type2 = scanner.nextInt();
                Scanner scanner1 = new Scanner(System.in);
                switch (type2) {
                    case 1: {
                        int type3 = scanner.nextInt();
                        System.out.println("Выберите напиток");
                    }
                }
                break;
            }
            case 3:
                Drink a = Drink.valueOf("COFFEE");
                switch (a) {
                    case COFFEE:
                        System.out.println("Вы выбрали кофе");
                    case WATER:
                        System.out.println("Вы выбрали воду");
                    case JUICE:
                        System.out.println("Вы выбрали сок");
                    case MILK:
                        System.out.println("Вы выбрали молочко");
                    case CHICORY:
                        System.out.println("Вы выбрали цикорий");
                        break;
                }
            default: {
                System.out.println("Вы ввели не корректное значение");

            }
        }
    }
}