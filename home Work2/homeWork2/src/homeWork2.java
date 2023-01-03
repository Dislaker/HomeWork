import java.util.Arrays;
import java.util.Scanner;

public class homeWork2 {
}

class Main1 {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (99 - 10)) + 10;
            System.out.println(array[i] + "");
        }
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                if (array[i - 1] >= array[i]) {
                    System.out.println("Прогрессия не возрастающая");
                    break;
                }
            }
            if (i == array.length - 1) System.out.println("Последовательность строго возрастающая");

        }
    }
}

class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int down;
        int up;

        while (true) {
            System.out.print("Введите размер массива: ");
            size = sc.nextInt();

            if (size > 0) {
                break;
            }
        }
        while (true) {
            System.out.print("Введите нижний диапазон: ");
            down = sc.nextInt();

            System.out.print("Введите верхний диапазон: ");
            up = sc.nextInt();

            if (down < up) {
                break;
            }
        }

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (up - down)) + down;
            System.out.print(array[i] + " ");
        }
    }
}

class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива N: ");
        int n = sc.nextInt();

        System.out.print("Введите A: ");
        int a = sc.nextInt();

        System.out.print("Введите B: ");
        int b = sc.nextInt();
        int[] array = new int[n];
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a)) + a;
            if (array[i] > array[maxIndex]) {
                b = array[i];
                maxIndex = i;

            }
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Максимальный индекс: " + maxIndex);
    }
}

class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива N: ");
        int n = sc.nextInt();

        System.out.print("Введите A: ");
        int a = sc.nextInt();

        System.out.print("Введите B: ");
        int b = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a)) + a;
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
        System.out.println();
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = sc.nextInt();

        int[] array = {15, 23, 6, 17, 27, 36, 42, 11, 52, 3, 21, 12, 45, 9, 14, 51, 32, 5, 49, 54};
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                index = i;
                break;
            }
        }
        System.out.print("Индекс числа " + index);
    }
}

class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива N: ");
        int n = sc.nextInt();

        System.out.print("Введите A: ");
        int a = sc.nextInt();

        System.out.print("Введите B: ");
        int b = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a)) + a;
        }
        System.out.println("Массив: " + Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("Массив после реверса: " + Arrays.toString(array));
    }
}

class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива N: ");
        int n = sc.nextInt();

        System.out.print("Введите нижний диапазон A: ");
        int a = sc.nextInt();

        System.out.print("Введите верхний диапазон B: ");
        int b = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a)) + a;
        }
        System.out.print("Массив: " + Arrays.toString(array));
        System.out.println();
        System.out.print("Введите искомое значение: ");

        int k = sc.nextInt();
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                index = i;
                break;
            }
        }
        System.out.println("Индекс числа " + index);
        System.out.print("Линейный поиск: " + (index + 1) + "шаг(-а)(-ов)");
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
        int lowIndex = 0;
        int highIndex = array.length - 1;
        int step = 0;

        while (lowIndex <= highIndex) {
            step = step + 1;
            int midIndex = (lowIndex + highIndex) / 2;
            if (k == array[midIndex]) {
                break;
            } else if (k < array[midIndex]) {
                highIndex = midIndex - 1;
            } else if (k > array[midIndex]) {
                lowIndex = midIndex + 1;
            }
        }
        System.out.print("Двоичный поиск: " + step + "шаг(-а)(-ов)");
    }
}

class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = sc.nextLine();

        System.out.print("Введите символ: ");
        char a = sc.next().charAt(0);
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                index = index + 1;
            }
        }
        System.out.print("Результат: " + index);
    }
}

class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = sc.nextLine();
        String string = " ";

        while (true) {
            if (str != "") {
                string = str;
                break;
            } else {
                System.out.print("Повторите ввод");
            }
        }
        System.out.print("Введите символ 1: ");
        char a = sc.next().charAt(0);
        System.out.print("Введите символ 2: ");
        char b = sc.next().charAt(0);

        StringBuilder newString = new StringBuilder(string);

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == a) {
                newString.setCharAt(i, b);
            }
        }
        System.out.println(newString);
    }
}