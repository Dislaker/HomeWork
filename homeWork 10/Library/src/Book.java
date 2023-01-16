import java.io.Serializable;

class Book implements Serializable {

    String name;
    String authorName;
    String text;

    public Book(String name) {
        this.name = name;
        this.authorName = authorName;
        this.text = text;
    }

}