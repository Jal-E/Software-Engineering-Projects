package test;

import org.junit.jupiter.api.Test;
import texteditor.CharacterStyle;
import texteditor.Document;

import static org.junit.jupiter.api.Assertions.*;

class DocumentTest {

    @Test
    void testAddCharacterWithSharedStyles() {
        Document document = new Document();

        // Add characters with the same style properties
        document.addCharacter('A', "Arial", "Red", 12);
        document.addCharacter('B', "Arial", "Red", 12);

        // Verify both characters share the same CharacterStyle instance
        CharacterStyle style1 = document.getCharacters().get(0).getStyle();
        CharacterStyle style2 = document.getCharacters().get(1).getStyle();
        assertSame(style1, style2, "Both characters should share the same style instance");
    }
}
