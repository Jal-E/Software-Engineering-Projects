package texteditor;

import java.io.*;
import java.util.Scanner;

public class FileHandler {

    // Save the document to a text file in a readable format
    public static void saveDocument(Document document, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Character character : document.getCharacters()) {
                // Write each character's properties to the file
                writer.write(character.getSymbol() + " " +
                        character.getStyle().getFont() + " " +
                        character.getStyle().getColor() + " " +
                        character.getStyle().getSize());
                writer.newLine();
            }
            System.out.println("Document saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load the document from the text file
    public static Document loadDocument(String filename) {
        Document document = new Document();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                if (parts.length == 4) {
                    char symbol = parts[0].charAt(0);
                    String font = parts[1];
                    String color = parts[2];
                    int size = Integer.parseInt(parts[3]);
                    document.addCharacter(symbol, font, color, size);
                }
            }
            System.out.println("Document loaded from " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return document;
    }
}
