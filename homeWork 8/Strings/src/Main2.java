import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сайт: ");
        String site = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+\\.com+$");
        Matcher matcher = pattern.matcher(site);

        System.out.println(matcher.matches());
    }
}
