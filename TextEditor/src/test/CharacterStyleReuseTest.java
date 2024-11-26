package test;

import texteditor.CharacterStyle;
import texteditor.CharacterStyleFactory;
import texteditor.Document;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertSame;

public class CharacterStyleReuseTest {

    @Test
    public void testStyleReuseAcrossCharacters() {
        Document document = new Document();

        // Add characters with the same style
        document.addCharacter('A', "Arial", "Red", 12);
        document.addCharacter('B', "Arial", "Red", 12);

        CharacterStyle style1 = document.getCharacters().get(0).getStyle();
        CharacterStyle style2 = document.getCharacters().get(1).getStyle();

        // Check if the two characters share the same style instance
        assertSame(style1, style2, "Characters with the same properties should share the same CharacterStyle instance");
    }
}
