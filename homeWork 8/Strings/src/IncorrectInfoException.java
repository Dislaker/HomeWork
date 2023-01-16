public class IncorrectInfoException extends Exception {
    int age;
    String name;

    public IncorrectInfoException(String name) {
        this.name = name;
    }
    public IncorrectInfoException(int age) {
        this.age = age;
    }


}
