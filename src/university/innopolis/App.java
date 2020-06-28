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
        int result;
        int type1 = scanner.nextInt();
        boolean success;
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
                Integer balance = scanner.nextInt();;
                do  {


                    success = Boolean.FALSE;
                    List<String> avaliable = new ArrayList<>();
                    System.out.println("Вы внесли " + balance + " руб.\n" +
                            "Выберите напиток");

                    for (Drink c : Drink.values()) {
                        System.out.println(c.getNum() + ". " + c.getTitle() + ": " + c.getCost() + " Р.");
                        avaliable.add(String.valueOf(c.getNum()));
                    }
                    Integer localType = scanner.nextInt();
                    for (Drink value : Drink.values()) {
                        if (localType.equals(value.getNum())) {
                            System.out.println("Вы выбрали " + value.getTitle());
                            success = Boolean.TRUE;

                        } else {
                            System.out.println("выберите значени из списка " + avaliable.toString());
                            success = Boolean.FALSE;
                        }
                    }

                } while (!success);
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
