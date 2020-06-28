package university.innopolis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        int type1 = scanner.nextInt();
        List<Integer> avaliable = new ArrayList<>();
        switch (type1) {
            case 1: {
                for (Drink c : Drink.values()) {
                    System.out.println(c.getNum() + ". " + c.name() + ": " + c.getCost() + " Р.");
                }
                break;
            }
            case 2: {
                avaliable.clear();
                System.out.println("Внесите купюру на внутренний счет");
                Integer balance = scanner.nextInt();

                do {
                    System.out.println("Вы внесли " + balance + " руб.\n" +
                            "Выберите напиток");
                    for (Drink c : Drink.values()) {
                        System.out.println(c.getNum() + ". " + c.getTitle() + ": " + c.getCost() + " Р.");
                        avaliable.add(c.getNum());
                    }
                    Integer localType = scanner.nextInt();
                    if (avaliable.contains(localType)) {
                        System.out.println("Вы выбрали " + Drink.getNameByNumber(localType));
                        break;
                    } else {
                        System.out.println("выберите значени из списка " + avaliable.toString());
                    }

                } while (true);
            }
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
