import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone("375298385289", "Apple", 10);
        Phone phone2 = new Phone("375292613778", "Huawei");
        Phone phone3 = new Phone();

        System.out.println(phone1.getNumber() + " " + phone1.model + " " + phone1.weight);
        System.out.println();

        System.out.println(phone2.getNumber() + " " + phone2.model + " " + phone2.weight);
        System.out.println();

        System.out.println(phone3.getNumber() + " " + phone3.model + " " + phone3.weight);
        System.out.println();

        phone1.receiveCall("Владимир");
        phone2.receiveCall("Григорий", "375298516171");

        phone1.sendMessage("Всем привет", "375298516121", "375298543171", "375298636171");


    }
}
