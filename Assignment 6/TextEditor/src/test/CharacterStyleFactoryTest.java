package test;

import org.junit.jupiter.api.Test;
import texteditor.CharacterStyle;
import texteditor.CharacterStyleFactory;

import static org.junit.jupiter.api.Assertions.*;

class CharacterStyleFactoryTest {

    @Test
    void testUniqueStyleInstances() {
        CharacterStyle style1 = CharacterStyleFactory.getCharacterStyle("Arial", "Red", 12);
        CharacterStyle style2 = CharacterStyleFactory.getCharacterStyle("Arial", "Red", 12);
        CharacterStyle style3 = CharacterStyleFactory.getCharacterStyle("Calibri", "Blue", 14);

        // Verify that the same combination returns the same instance
        assertSame(style1, style2, "Style1 and Style2 should be the same instance");

        // Verify that a different combination returns a different instance
        assertNotSame(style1, style3, "Style1 and Style3 should be different instances");
    }
}
