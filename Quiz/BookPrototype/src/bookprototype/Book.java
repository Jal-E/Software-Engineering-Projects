package bookprototype;

import java.util.List;

public class Book {
    private String title;
    private List<String> chapters;

    public Book(String title, List<String> chapters) {
        this.title = title;
        this.chapters = chapters;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getChapters() {
        return chapters;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setChapters(List<String> chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Book Title: " + title + ", Chapters: " + chapters;
    }
}
