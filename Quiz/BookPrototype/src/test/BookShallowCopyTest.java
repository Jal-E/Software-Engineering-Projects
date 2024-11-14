import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import bookprototype.BookShallowCopy;
import java.util.ArrayList;
import java.util.List;

public class BookShallowCopyTest {

    @Test
    public void testShallowCopy() {
        // Create original book with a list of chapters
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1");
        chapters.add("Chapter 2");

        BookShallowCopy originalBook = new BookShallowCopy("Shallow Book", chapters);

        // Clone the book (shallow copy)
        BookShallowCopy clonedBook = originalBook.clone();

        // Modify original book's chapters
        originalBook.addChapter("Chapter 3");

        // Test that both original and clone share the same chapter list
        assertEquals(originalBook.getChapters(), clonedBook.getChapters(), "Chapters should be shared between original and clone in shallow copy.");
        assertTrue(originalBook.getChapters().contains("Chapter 3"), "Original book should contain the new chapter.");
        assertTrue(clonedBook.getChapters().contains("Chapter 3"), "Cloned book should also reflect the new chapter.");
    }
}
