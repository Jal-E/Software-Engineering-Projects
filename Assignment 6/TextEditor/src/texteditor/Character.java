package texteditor;

import java.io.Serializable;

public class Character implements Serializable {
    private final char symbol;
    private final CharacterStyle style;

    public Character(char symbol, CharacterStyle style) {
        this.symbol = symbol;
        this.style = style;
    }

    public char getSymbol() {
        return symbol;
    }

    public CharacterStyle getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return symbol + " [" + style + "]";
    }
}
