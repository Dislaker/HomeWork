import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int action;

        ArrayList<Reader> readers = new ArrayList<Reader>();

        do {
            System.out.println();
            System.out.println("1 -- Добавить нового читателя");
            System.out.println("2 -- Читатель хочет взять книгу");
            System.out.println("3 -- Читатель хочет вернуть книгу");
            System.out.println("4 -- Вывести статус читателя");
            System.out.println("5 -- Вывести статусы всех читателей");
            System.out.println("6 -- Выйти из программы");
            System.out.println();
            System.out.println("Введите номер действия: ");
            action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1: {
                    Reader reader = new Reader();

                    System.out.print("Введите имя: ");
                    reader.fullName = scanner.nextLine();
                    System.out.print("Введите номер читательского билета: ");
                    reader.number = scanner.nextInt();
                    scanner.nextLine();

                    readers.add(reader);

                    break;
                }

                case 2: {

                    System.out.print("Введите номер читательского билета: ");
                    int number = scanner.nextInt();
                    scanner.nextLine();

                    boolean found = false;

                    for (int i = 0; i < readers.size(); i++) {
                        if (readers.get(i).number == number) {
                            readers.get(i).takeBook();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }

                case 3: {
                    System.out.print("Введите номер читательского билета: ");
                    int number = scanner.nextInt();
                    scanner.nextLine();

                    boolean found = false;

                    for (int i = 0; i < readers.size(); i++) {
                        if (readers.get(i).number == number) {
                            readers.get(i).returnBook();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    System.out.println();
                    break;
                }

                case 4: {
                    System.out.print("Введите номер читательского билета: ");
                    int number = scanner.nextInt();
                    scanner.nextLine();

                    boolean found = false;

                    for (int i = 0; i < readers.size(); i++) {
                        if (readers.get(i).number == number) {
                            readers.get(i).printStatus();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }

                case 5: {
                    for (Reader r : readers) {
                        if (r != null) {
                            r.printStatus();
                        }
                    }
                }
                case 6: {
                    System.out.println("Завершаем программу");
                    break;
                }

                default: {
                    System.out.println("Нет такой команды");
                    break;
                }
            }
        } while (action != 6);
    }
}