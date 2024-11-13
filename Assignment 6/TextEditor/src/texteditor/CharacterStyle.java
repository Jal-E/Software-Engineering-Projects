package texteditor;

import java.io.Serializable;

public class CharacterStyle implements Serializable {
    private final String font;
    private final String color;
    private final int size;

    public CharacterStyle(String font, String color, int size) {
        this.font = font;
        this.color = color;
        this.size = size;
    }

    public String getFont() {
        return font;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Font: " + font + ", Color: " + color + ", Size: " + size;
    }

    @Override
    public int hashCode() {
        return font.hashCode() + color.hashCode() + size;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CharacterStyle style = (CharacterStyle) obj;
        return size == style.size && font.equals(style.font) && color.equals(style.color);
    }
}
