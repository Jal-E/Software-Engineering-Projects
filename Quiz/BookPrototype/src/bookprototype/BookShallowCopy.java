package bookprototype;

import java.util.List;

public class BookShallowCopy extends Book implements Cloneable {

    public BookShallowCopy(String title, List<String> chapters) {
        super(title, chapters);
    }

    @Override
    public BookShallowCopy clone() {
        try {
            return (BookShallowCopy) super.clone();  // Performs shallow copy
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void addChapter(String chapter) {
        getChapters().add(chapter);  // the getter to access the chapters list
    }
}
