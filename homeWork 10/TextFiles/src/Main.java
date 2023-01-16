import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File way = new File("D:\\Java\\HomeWork\\homeWork 10\\TextFiles\\Files");
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(way, "result.txt")));

        if (way.exists()) {
            for (File file : way.listFiles()) {
                try (BufferedReader read = new BufferedReader(new FileReader(file))) {
                    String string;
                    while ((string = read.readLine()) != null) {
                        writer.write(string + "\s");
                    }

                } catch(Exception ex){
                    System.out.println("Не удалось прочесть файл");
                }
            }
        }
        writer.close();
    }
}