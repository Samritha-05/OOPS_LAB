package exp09filehandling;

import java.io.*;

public class FileReport {
    public static void main(String[] args) {
        String inputFile = "data.txt";
        String outputFile = "report.txt";

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                writer.write("File Report for: " + inputFile + "\n");
                writer.write("Total Characters: " + charCount + "\n");
                writer.write("Total Words: " + wordCount + "\n");
                writer.write("Total Lines: " + lineCount + "\n");
                System.out.println("Report written successfully to " + outputFile);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File " + inputFile + " not found.");
        } catch (IOException e) {
            System.out.println("Error reading or writing file: " + e.getMessage());
        }
    }
}

