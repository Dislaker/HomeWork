public class Phone {

    String number;
    String model;
    int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " с номера " + number);
        System.out.println("Мой номер: " + getNumber());
    }

    public String getNumber() {
        return number;
    }

    void sendMessage(String message, String... numbers) {
        System.out.println("Отправлено сообщение " + message + " на телефоны: ");
        for (String number : numbers) {
            System.out.println(number);
        }
    }

}
