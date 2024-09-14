import java.util.ArrayList;

public class Folder {
    private String folderName;
    private ArrayList<File> files;
    private ArrayList<Folder> subFolders;

    // Constructor
    public Folder(String folderName) {
        this.folderName = folderName;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }

    // Getter for folderName
    public String getFolderName() {
        return folderName;
    }

    // Add a file to the folder
    public void addFile(File file) {
        files.add(file);
    }

    // Add a subfolder to the folder
    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    // Print the contents of the folder
    public void print(String indent) {
        System.out.println(indent + "Folder: " + folderName);

        
        for (File file : files) {
            file.print(indent + "  ");  
        }

        // Recursively print all subfolders
        for (Folder subFolder : subFolders) {
            subFolder.print(indent + "  "); 
        }
    }

    // Delete a subfolder
    public void deleteSubFolder(String folderName) {
        subFolders.removeIf(subFolder -> subFolder.getFolderName().equals(folderName));
    }
}
