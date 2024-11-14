package bookprototype;

import java.util.ArrayList;
import java.util.List;

public class BookDeepCopy extends Book implements Cloneable {

    public BookDeepCopy(String title, List<String> chapters) {
        super(title, new ArrayList<>(chapters));  // Deep copy for the list
    }

    @Override
    public BookDeepCopy clone() {
        List<String> clonedChapters = new ArrayList<>(getChapters());  // Create a new list for deep copying
        return new BookDeepCopy(getTitle(), clonedChapters);
    }

    public void addChapter(String chapter) {
        getChapters().add(chapter);  // Use the getter to access the chapters list
    }
}
