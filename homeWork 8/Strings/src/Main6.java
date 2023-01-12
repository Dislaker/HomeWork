import java.util.Scanner;
import java.util.regex.Pattern;

public class Main6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String name = scan.nextLine();

        System.out.print("Введите возраст: ");
        int age = scan.nextInt();

        String string = "[A-Za-zа-яА-я ]+";

        try {
            if (age > 100 || age < 0) {
                throw new IncorrectInfoException("Некорректный возраст", age);
            }

            if (name.length() > 200 || !Pattern.matches(string, name)) {
                throw new IncorrectInfoException("Некорректное имя", name);
            }
        } catch (IncorrectInfoException ex) {
            ex.printStackTrace();
        }
    }
}
