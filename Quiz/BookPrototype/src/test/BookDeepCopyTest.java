import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import bookprototype.BookDeepCopy;
import java.util.ArrayList;
import java.util.List;

public class BookDeepCopyTest {

    @Test
    public void testDeepCopy() {
        // Create original book with a list of chapters
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1");
        chapters.add("Chapter 2");

        BookDeepCopy originalBook = new BookDeepCopy("Deep Book", chapters);

        // Clone the book (deep copy)
        BookDeepCopy clonedBook = originalBook.clone();

        // Modify original book's chapters
        originalBook.addChapter("Chapter 3");

        // Test that original and clone have different chapter lists
        assertNotEquals(originalBook.getChapters(), clonedBook.getChapters(), "Chapters should not be shared between original and clone in deep copy.");
        assertTrue(originalBook.getChapters().contains("Chapter 3"), "Original book should contain the new chapter.");
        assertFalse(clonedBook.getChapters().contains("Chapter 3"), "Cloned book should not reflect the new chapter.");
    }
}
