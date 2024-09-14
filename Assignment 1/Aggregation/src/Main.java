public class Main {
    public static void main(String[] args) {
        // Create two Instructor objects
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("Ben", "Steichen", "8-21");

        // Create two Textbook objects
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Interaction Design: Beyond Human-Computer Interaction", "Yvonne Rogers", "John Wiley & Sons Inc");

        // Create two Course objects
        Course course1 = new Course("Software Engineering", instructor1, textbook1);
        Course course2 = new Course("Human-Computer Interaction", instructor2, textbook2);

        // Print course details
        System.out.println("Course 1:");
        course1.printCourseDetails();
        System.out.println();

        System.out.println("Course 2:");
        course2.printCourseDetails();
    }
}
