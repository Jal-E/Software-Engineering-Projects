public class Main {
    public static void main(String[] args) {
        // Create the main folder "php_demo1"
        Folder phpDemo = new Folder("php_demo1");

        // Create subfolder "Source Files"
        Folder sourceFiles = new Folder("Source Files");
        phpDemo.addSubFolder(sourceFiles);

        // Add the .phalcon file to "Source Files"
        sourceFiles.addFile(new File(".phalcon"));

        // Add "app" subfolder and its subfolders
        Folder app = new Folder("app");
        sourceFiles.addSubFolder(app);
        app.addSubFolder(new Folder("config"));
        app.addSubFolder(new Folder("controllers"));
        app.addSubFolder(new Folder("library"));
        app.addSubFolder(new Folder("migrations"));
        app.addSubFolder(new Folder("models"));
        app.addSubFolder(new Folder("views"));

        // Add other subfolders to "Source Files"
        sourceFiles.addSubFolder(new Folder("cache"));

        // Add "public" folder and files inside it
        Folder publicFolder = new Folder("public");
        publicFolder.addFile(new File(".htaccess"));
        publicFolder.addFile(new File("htrouter.php"));
        publicFolder.addFile(new File("index.html"));
        sourceFiles.addSubFolder(publicFolder);

        // Add "Include Path" and "Remote Files" under php_demo1
        phpDemo.addSubFolder(new Folder("Include Path"));
        phpDemo.addSubFolder(new Folder("Remote Files"));

        // Print the entire structure with indentation
        System.out.println("Initial Folder Structure:");
        phpDemo.print("");  // Call print with no initial indentation

        // Delete the "app" folder and print the structure with indentation
        System.out.println("\nAfter deleting the 'app' folder:");
        sourceFiles.deleteSubFolder("app");
        phpDemo.print("");

        // Delete the "public" folder and print the structure with indentation
        System.out.println("\nAfter deleting the 'public' folder:");
        sourceFiles.deleteSubFolder("public");
        phpDemo.print("");
    }
}
