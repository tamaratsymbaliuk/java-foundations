package String;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadInputFile {
    public static void main(String[] args) {
        // Example for a Windows system
        String filePath = "C:\\Users\\YourUsername\\Documents\\input.txt";

        // Example for a Unix-based system (macOS/Linux)
        // String filePath = "/Users/YourUsername/Documents/input.txt";

        readFile(filePath);
    }

    public static void readFile(String filePath) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the file: " + e.getMessage());
                }
            }
        }
    }
}

