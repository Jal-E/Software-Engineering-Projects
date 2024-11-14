package bookprototype;

import java.util.ArrayList;
import java.util.List;

public class BookPrototypeDriver {
    public static void main(String[] args) {
        // Original chapters list
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1: Introduction");
        chapters.add("Chapter 2: Basics");

        // Part 2: Demonstrate Shallow Copy
        System.out.println("Demonstrating Shallow Copy:");
        BookShallowCopy originalShallow = new BookShallowCopy("Java Programming", chapters);
        BookShallowCopy shallowCopy = originalShallow.clone();

        System.out.println("Original Book (Before Modification): " + originalShallow);
        System.out.println("Shallow Copy (Before Modification): " + shallowCopy);

        // Modify original book chapters
        originalShallow.getChapters().add("Chapter 3: Advanced Topics");

        System.out.println("Original Book (After Modification): " + originalShallow);
        System.out.println("Shallow Copy (After Modification): " + shallowCopy);

        // Part 3: Demonstrate Deep Copy
        System.out.println("\nDemonstrating Deep Copy:");
        BookDeepCopy originalDeep = new BookDeepCopy("Python Programming", chapters);
        BookDeepCopy deepCopy = originalDeep.clone();

        System.out.println("Original Book (Before Modification): " + originalDeep);
        System.out.println("Deep Copy (Before Modification): " + deepCopy);

        // Modify original book chapters
        originalDeep.getChapters().add("Chapter 4: Expert Topics");

        System.out.println("Original Book (After Modification): " + originalDeep);
        System.out.println("Deep Copy (After Modification): " + deepCopy);
    }
}
