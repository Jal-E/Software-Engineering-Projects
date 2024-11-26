package texteditor;

import java.util.HashMap;

public class CharacterStyleFactory {
    private static final HashMap<String, CharacterStyle> styles = new HashMap<>();

    public static CharacterStyle getCharacterStyle(String font, String color, int size) {
        String key = font + color + size;
        if (!styles.containsKey(key)) {
            styles.put(key, new CharacterStyle(font, color, size));
        }
        return styles.get(key);
    }
}
