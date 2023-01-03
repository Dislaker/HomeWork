// HomeWork Vladimir

import java.util.Scanner;

class Main1 {
    public static void main(String[] args) {

        int n = 9;
        if (n % 2 == 0) {
            System.out.println(n + " - четное число");
        } else {
            System.out.println(n + " - нечетное число");
        }
    }
}

class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день: ");
        int m = sc.nextInt();

        if (m == 1) {
            System.out.println("Понедельник");
        } else if (m == 2) {
            System.out.println("Вторник");
        } else if (m == 3) {
            System.out.println("Среда");
        } else if (m == 4) {
            System.out.println("Четверг");
        } else if (m == 5) {
            System.out.println("Пятница");
        } else if (m == 6) {
            System.out.println("Суббота");
        } else if (m == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Такого дня нет");
        }
        switch (m) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такого дня нет");
        }
    }
}

class Main3 {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int c = 8;
        if (a > b && c > b) {
            System.out.println(a + c);
        } else if (a < b && c > b) {
            System.out.println(b + c);
        } else if (a > b && c < b) {
            System.out.println(a + b);
        }
    }
}

class Main4 {
    public static void main(String[] args) {
        int year = 2022;

        if (year % 4 != 0) {
            System.out.println("Год невисокосный");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("Год невисокосный");
        } else {
            System.out.println("Год високосный");
        }
    }
}

class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите действие: ");
        int N = sc.nextInt();

        int A = 8;
        int B = 4;
        if (N == 1) {
            System.out.println(A + B);
        } else if (N == 2) {
            System.out.println(A - B);
        } else if (N == 3) {
            System.out.println(A * B);
        } else if (N == 4) {
            System.out.println(A / B);
        }
    }
}

class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int d = sc.nextInt();
        if (d % 2 == 0 && d <= 100) {
            System.out.println("четное двухзначное число");
        } else if (d % 2 != 0 && d <= 100) {
            System.out.println("нечетное двухзначное число");
        } else if (d % 2 == 0 && d >= 100) {
            System.out.println("четное трехзначное число");
        } else if (d % 2 != 0 && d >= 100) {
            System.out.println("нечетное трехзначное число");
        }
    }
}

class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день: ");
        int D = sc.nextInt();
        Scanner s = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        int M = s.nextInt();
        if ((D >= 20 && M == 1) || (D <= 18 && M == 2)) {
            System.out.println("Водолей");
        } else if ((D >= 19 && M == 2) || (D <= 20 && M == 3)) {
            System.out.println("Рыбы");
        } else if ((D >= 21 && M == 3) || (D <= 19 && M == 4)) {
            System.out.println("Овен");
        } else if ((D >= 20 && M == 4) || (D <= 20 && M == 5)) {
            System.out.println("Телец");
        } else if ((D >= 21 && M == 5) || (D <= 21 && M == 6)) {
            System.out.println("Близнецы");
        } else if ((D >= 22 && M == 6) || (D <= 22 && M == 7)) {
            System.out.println("Рак");
        } else if ((D >= 23 && M == 7) || (D <= 22 && M == 8)) {
            System.out.println("Лев");
        } else if ((D >= 23 && M == 8) || (D <= 22 && M == 9)) {
            System.out.println("Дева");
        } else if ((D >= 23 && M == 9) || (D <= 22 && M == 10)) {
            System.out.println("Весы");
        } else if ((D >= 23 && M == 10) || (D <= 22 && M == 11)) {
            System.out.println("Скорпион");
        } else if ((D >= 23 && M == 11) || (D <= 21 && M == 12)) {
            System.out.println("Стрелец");
        } else if ((D >= 22 && M == 12) || (D <= 19 && M == 1)) {
            System.out.println("Козерог");
        }
    }
}

class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите достоинство: ");
        int n = sc.nextInt();
        Scanner s = new Scanner(System.in);
        System.out.println("Введите масть: ");
        int m = s.nextInt();
        switch (n) {
            case 6:
                System.out.println("шестерка");
                break;
            case 7:
                System.out.println("семерка");
                break;
            case 8:
                System.out.println("восьмерка");
                break;
            case 9:
                System.out.println("девятка");
                break;
            case 10:
                System.out.println("десятка");
                break;
            case 11:
                System.out.println("валет");
                break;
            case 12:
                System.out.println("дама");
                break;
            case 13:
                System.out.println("король");
                break;
            case 14:
                System.out.println("туз");
                break;
        }
        switch (m) {
            case 1:
                System.out.println("пики");
                break;
            case 2:
                System.out.println("трефы");
                break;
            case 3:
                System.out.println("бубны");
                break;
            case 4:
                System.out.println("червы");
                break;
        }
    }

}

class Main9 {
    public static void main(String[] args) {
        int t = 1;
        while (t < 5) {
            System.out.println("Task" + t);
            t++;
        }
    }
}

class Main10 {
    public static void main(String[] args) {
        int q = 0;
        do {
            q = q + 5;
            System.out.println(q);
        }
        while (q < 100);
    }
}

class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        int r = 1;
        for (int index = 1; index <= n; index++) {
            r = r * index;
        }
        System.out.println(r);
    }
}

class Main12 {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int n = 0;
        for (int index = a + 1; index < b; index++) {
            System.out.println(index);
            n++;
        }
        System.out.println("Количество цифр: " + n);
    }
}

class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите отрезок А: ");
        int а = sc.nextInt();
        Scanner s = new Scanner(System.in);
        System.out.println("Введите отрезок В: ");
        int b = s.nextInt();
        while (а >= b) {
            а = а - b;
        }
        System.out.println("Длина отрезка " + а);
    }
}


class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите A: ");
        int A = sc.nextInt();
        Scanner s = new Scanner(System.in);
        System.out.println("Введите B: ");
        int B = s.nextInt();
        Scanner c = new Scanner(System.in);
        System.out.println("Введите C: ");
        int C = c.nextInt();
        int D = 0;
        int E = 0;
        while (A >= C) {
            A = A - C;
            D++;
        }
        while (B >= C) {
            B = B - C;
            E++;
        }
        System.out.println("Количество квадратов: " + (D * E));
    }
}

class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите A: ");
        int z = sc.nextInt();
        int c = 0;
        int s = 0;
        int d = 0;
        while (z > 0) {
            int x = z % 10;
            System.out.print(x);
            z = z / 10;
            s += 1;
            if (x == 2) {
                c = x;
            }
            d = d + x;
        }
        System.out.println();
        if (c == 2) {
            System.out.println("есть цифра 2");
        } else {
            System.out.println("нет цифры 2");
        }
        System.out.println("Количество цифр = " + s);
        System.out.println("Сумма цифр " + d);
    }
}

class Main16 {
    public static void main(String[] args) {
        int money = 1000;
        int p = 5;
        int months = 0;
        for (int index = 1; money < 1100; index++) {
            money = money + (money * p / 100);
            months = index;
        }
        System.out.println(months);
        System.out.println(money);
    }
}

