public class File {
    private String fileName;

    // Constructor
    public File(String fileName) {
        this.fileName = fileName;
    }

    // Print method with indentation
    public void print(String indent) {
        System.out.println(indent + "File: " + fileName);
    }
}
