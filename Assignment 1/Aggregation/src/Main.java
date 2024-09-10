public class Main {
    public static void main(String[] args) {
        // Create two Instructor objects
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("John", "Doe", "2-1234");

        // Create two Textbook objects
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Effective Java", "Joshua Bloch", "Addison-Wesley");

        // Create two Course objects
        Course course1 = new Course("Software Engineering", instructor1, textbook1);
        Course course2 = new Course("Advanced Java Programming", instructor2, textbook2);

        // Print course details
        System.out.println("Course 1:");
        course1.printCourseDetails();
        System.out.println();

        System.out.println("Course 2:");
        course2.printCourseDetails();
    }
}
