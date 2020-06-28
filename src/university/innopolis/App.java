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
                for (Drink c : Drink.values()) {
                    System.out.println(c.getNum() + ". " + c.name() + ": " + c.getCost() + " Р.");
                }
                break;
            }
            case 2: {
                System.out.println("Внесите купюру на внутренний счет");
                Integer balance = 0;
                while (scanner.hasNextInt()) {
                    System.out.println("Вы внесли " + scanner.nextInt() + " руб.\n" +
                            "Выберите напиток");
                    for (Drink c : Drink.values()) {
                        System.out.println(c.getNum() + ". " + c.name() + ": " + c.getCost() + " Р.");
                    }
                    break;
                    if (type1 == 1) {
                        System.out.println("Вы выбрали кофе");
                    }
                    if (type1 == 2) {
                        System.out.println("Вы выбрали молочко");
                    }
                    if (type1 == 3) {
                        System.out.println("Вы выбрали цикорий");
                    }
                    if (type1 == 4) {
                        System.out.println("Вы выбрали воду");
                    }
                    if (type1 == 5) {
                        System.out.println("Вы выбрали сок");
                    }
                }
            }
                int type2 = scanner.nextInt();
                Scanner scanner1 = new Scanner(System.in);
                switch (type2) {
                    case 1: {
                        int type3 = scanner.nextInt();
                        System.out.println("Выберите напиток");
                    }
                }
                break;

            case 3: {
                System.out.println(Arrays.toString(Drink.values()));
                break;
            }

            default: {
                System.out.println("Вы ввели не корректное значение");
            }
        }


    }
}
