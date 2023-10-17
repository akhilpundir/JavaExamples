import java.io.*;
import java.util.Scanner;
//Character Stream Example
public class SimpleTextEditor {
    public static void main(String[] args) {
        String fileName;

        // Read the file name from the command line arguments
        if (args.length == 1) {
            fileName = args[0];
        } else {
            System.out.println("Welcome to the Simple Text Editor!");
            System.out.print("Enter the name of the file you want to create or edit: ");
            fileName = new Scanner(System.in).nextLine();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true)) // Append mode
        ) {
            System.out.println("Start typing. Press Enter to save and exit.");
            String line;

            do {
                line = new Scanner(System.in).nextLine();
                if (!line.isEmpty()) {
                    writer.write(line);
                    writer.newLine();
                }
            } while (!line.isEmpty());

            System.out.println("Text saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
