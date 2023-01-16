import java.io.*;
import java.util.ArrayList;

public class FileUtil {

    static void saveReadersList(ArrayList<Reader> readers) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Java\\HomeWork\\homeWork 10\\Library\\file.txt"))) {

            oos.writeUnshared(readers);

        } catch (Exception ex) {
            System.out.println("Не сохранилось");
        }
    }

    static public ArrayList<Reader> restoreReadersList() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Java\\HomeWork\\homeWork 10\\Library\\file.txt"))) {

            ArrayList<Reader> readers = (ArrayList<Reader>) ois.readObject();
            return readers;
        } catch (Exception ex) {
            System.out.println("Не получилось открыть");
            return new ArrayList<Reader>();
        }
    }
}