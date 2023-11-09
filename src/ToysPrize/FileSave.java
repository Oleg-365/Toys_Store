package ToysPrize;

import java.io.IOException;
import java.io.FileWriter;
import static ToysPrize.ToysStore.toys;
public class FileSave {
    public static String fileName = "prizeToys.txt";
    public static void savePrizeToy(Toy prazeToy) {
        String text = "Выдана - " + prazeToy.toString();
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл игрушки");
        }
        toys.remove(prazeToy);
    }
}