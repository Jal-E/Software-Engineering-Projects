package test;

import texteditor.Character;
import texteditor.CharacterStyle;
import texteditor.Document;
import texteditor.FileHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

public class DocumentContentAfterReloadTest {

    @Test
    public void testDocumentContentAfterReload() {
        Document document = new Document();
        document.addCharacter('H', "Arial", "Red", 12);
        document.addCharacter('e', "Arial", "Red", 12);
        document.addCharacter('l', "Calibri", "Blue", 14);
        document.addCharacter('o', "Verdana", "Black", 16);

        // Save the document
        String filename = "testDocumentContent.txt";
        FileHandler.saveDocument(document, filename);

        // Load the document
        Document loadedDocument = FileHandler.loadDocument(filename);
        List<Character> loadedCharacters = loadedDocument.getCharacters();

        // Verify the characters and their styles in the loaded document
        assertEquals(document.getCharacters().size(), loadedCharacters.size(), "Loaded document should have the same number of characters");

        for (int i = 0; i < document.getCharacters().size(); i++) {
            Character originalChar = document.getCharacters().get(i);
            Character loadedChar = loadedCharacters.get(i);

            // Check if character symbol and style properties match
            assertEquals(originalChar.getSymbol(), loadedChar.getSymbol(), "Character symbols should match");
            CharacterStyle originalStyle = originalChar.getStyle();
            CharacterStyle loadedStyle = loadedChar.getStyle();

            assertEquals(originalStyle.getFont(), loadedStyle.getFont(), "Fonts should match");
            assertEquals(originalStyle.getColor(), loadedStyle.getColor(), "Colors should match");
            assertEquals(originalStyle.getSize(), loadedStyle.getSize(), "Sizes should match");
        }
    }
}
