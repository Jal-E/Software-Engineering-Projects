package test;

import org.junit.jupiter.api.Test;
import texteditor.Document;
import texteditor.FileHandler;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class FileHandlerTest {

    @Test
    void testSaveAndLoadDocument() {
        // Create a document and add characters
        Document document = new Document();
        document.addCharacter('H', "Arial", "Red", 12);
        document.addCharacter('e', "Calibri", "Blue", 14);

        // Save the document to a file
        String filename = "testDocument.txt";
        FileHandler.saveDocument(document, filename);

        // Load the document from the file
        Document loadedDocument = FileHandler.loadDocument(filename);

        // Check if the loaded document has the same characters
        assertNotNull(loadedDocument, "Loaded document should not be null");
        assertEquals(document.getCharacters().size(), loadedDocument.getCharacters().size(),
                "Loaded document should have the same number of characters");

        // Cleanup the saved file
        File file = new File(filename);
        if (file.exists()) {
            assertTrue(file.delete(), "Test document file should be deleted after test");
        }
    }
}
