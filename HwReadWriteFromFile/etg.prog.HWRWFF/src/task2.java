import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by AsusD on 17.07.2016.
 */
public class task2 {
    public static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter("D:\\LJ\\FerstEdu\\HwReadWriteFromFile\\etg.prog.HWRWFF\\src\\output.txt");
        Scanner scanner = new Scanner(
                new FileInputStream("D:\\LJ\\FerstEdu\\HwReadWriteFromFile\\etg.prog.HWRWFF\\src\\input.txt"))){
            while (scanner.hasNextLine()) {

                writer.println(scanner.nextLine().toUpperCase());
                writer.close();
            }
        }
    }
}



