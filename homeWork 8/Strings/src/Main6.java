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
            if (name.length() > 200 || !Pattern.matches(string, name)) {
                System.out.println("Некорректное имя");
                throw new IncorrectInfoException(name);
            }
            if (age > 100 || age < 0) {
                System.out.println("Некорректный возраст");
                throw new IncorrectInfoException(age);
            }
        } catch (IncorrectInfoException ex) {
            ex.printStackTrace();
        }
    }
}
