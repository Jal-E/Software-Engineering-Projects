package texteditor;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private final List<Character> characters = new ArrayList<>();

    public void addCharacter(char symbol, String font, String color, int size) {
        CharacterStyle style = CharacterStyleFactory.getCharacterStyle(font, color, size);
        Character character = new Character(symbol, style);
        characters.add(character);
    }

    public void displayDocument() {
        for (Character character : characters) {
            System.out.println(character);
        }
    }

    public List<Character> getCharacters() {
        return characters;
    }
}
