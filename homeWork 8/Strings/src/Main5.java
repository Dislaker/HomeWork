import java.util.Scanner;
import java.util.regex.Pattern;

public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату: ");
        String str = scanner.nextLine();

        String date = "(1[0-9][0-9][0-9]|200[0-9]|201[12])/(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01]) ";
        String hours = "(0?[0-9]|1[0-9]|2[023]):(0?[0-9]|[1-5][0-9])";

        StringBuilder stringBuilder = new StringBuilder(date);
        stringBuilder.append(hours);

        System.out.println(Pattern.matches(String.valueOf(stringBuilder), str));
    }
}
