import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Reader {

    String fullName;
    int number;
    String faculty;
    String dateBirth;
    int numberPhone;

    List<Book> bookList = new LinkedList<Book>();

    public Reader() {
        this.fullName = fullName;
        this.number = number;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.numberPhone = numberPhone;
    }

    void printStatus() {

        System.out.print(fullName + " взял(а) " + bookList.size() + " книги: ");

        for (int i = 0; i < bookList.size(); i++) {
            System.out.print(bookList.get(i).name);
            if (i != bookList.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    void takeBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название книги: ");
        String name = scanner.nextLine();
        Book newBook = new Book(name);

        bookList.add(newBook);

        System.out.print(fullName + " взял книгу " + newBook.name);
        System.out.println();
    }

    void returnBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название книги: ");
        String name = scanner.nextLine();
        Book newBook = new Book(name);

        int k = 0;

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).name.equals(newBook.name)) {
                bookList.remove(i);
                System.out.print(fullName + " вернул книгу " + newBook.name);
                k++;
                break;
            }
        }
        if (k == 0) {
            System.out.print(fullName + " не хранит книгу " + newBook.name);
            System.out.println();
        }
    }
}