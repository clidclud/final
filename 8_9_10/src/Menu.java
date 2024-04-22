import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class Menu {
    public void menu() {

        Scanner scanner = new Scanner(in);
        Registry registry = new Registry();

        while (true) {
            System.out.println("Выбирите команду (Введите: 1, 2 или 3)\n" +
                    "1. Создать животное\n" +
                    "2. Вывести информацию о всех животных\n" +
                    "3. Выход");

            int num;
            try {
                num = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод");
                continue;
            }

            if (num == 1) {
                System.out.print("Введите кличку животного: ");
                String name = scanner.nextLine();

                System.out.print("Введите дату рождения (в формате ДД.ММ.ГГГГ): ");
                String data = scanner.nextLine();

                System.out.print("Введите команду животного (Для завершения введите stop): ");
                List<String> commands = new ArrayList<>();
                String command;
                while (!(command = scanner.nextLine()).equals("stop")) {
                    commands.add(command);
                    System.out.print("Введите следующую команду (Для завершения введите stop): ");
                }

                Animal animal = new Animal(name, data, commands);

                int type = 0;
                do {
                    System.out.println("К каким животным добавить? (Введите: 1 или 2)\n" +
                            "1. Домашние животные\n" +
                            "2. Вьючные животные");
                    try {
                        type = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Некорректный ввод");
                        continue;
                    }
                    if (type == 1) {
                        registry.addPetsAnimals(animal);
                    } else if (type == 2) {
                        registry.addPackAnimals(animal);
                    } else {
                        System.out.println("Такого варианта нет");
                    }
                } while (type != 1 && type != 2);

            } else if (num == 2) {
                registry.printAllAnimals();

            } else if (num == 3) {
                scanner.close();
                break;

            } else {
                System.out.println("Некорректный ввод");
            }
        }
    }
}
