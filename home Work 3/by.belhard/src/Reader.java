import java.util.Scanner;

class Reader {

    String fullName;
    int number;
    String faculty;
    String dateBirth;
    int numberPhone;
    Book[] bookList = new Book[10];

    public Reader() {
        this.fullName = fullName;
        this.number = number;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.numberPhone = numberPhone;
    }

    void printStatus() {
        int counter = 0;

        for (int i = 0; i < bookList.length - 1; i++) {
            if (bookList[i] != null) {
                counter++;
            }
        }
        System.out.print(fullName + " взял(а) " + counter + " книги: ");

        for (int i = 0; i < bookList.length - 1; i++) {
            if (bookList[i] != null) {
                System.out.print(bookList[i].name);
                if (i != counter - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }

    void takeBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название книги: ");
        String name = scanner.nextLine();
        Book newBook = new Book(name);

        for (int i = 0; i < bookList.length - 1; i++) {
            if (bookList[i] == null) {
                bookList[i] = newBook;
                break;
            }
        }
        System.out.print(fullName + " взял книгу " + newBook.name);
        System.out.println();
    }

    void returnBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название книги: ");
        String name = scanner.nextLine();
        Book newBook = new Book(name);

        int k = 0;

        for (int i = 0; i < bookList.length - 1; i++) {
            if (bookList[i] != null && bookList[i].name.equals(newBook.name)) {
                bookList[i] = null;
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
