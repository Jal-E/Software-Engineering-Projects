package texteditor;

public class TextEditorApp {
    public static void main(String[] args) {
        // Create a new document
        Document document = new Document();

        // Add characters with different styles to demonstrate flyweight
        document.addCharacter('H', "Arial", "Red", 12);
        document.addCharacter('e', "Arial", "Red", 12);
        document.addCharacter('l', "Calibri", "Blue", 14);
        document.addCharacter('l', "Calibri", "Blue", 14);
        document.addCharacter('o', "Verdana", "Black", 16);
        document.addCharacter('W', "Verdana", "Black", 16);
        document.addCharacter('o', "Arial", "Red", 12);
        document.addCharacter('r', "Arial", "Red", 12);
        document.addCharacter('l', "Calibri", "Blue", 14);
        document.addCharacter('d', "Calibri", "Blue", 14);
        document.addCharacter('C', "Arial", "Red", 12);
        document.addCharacter('S', "Arial", "Red", 12);
        document.addCharacter('5', "Verdana", "Black", 16);
        document.addCharacter('8', "Verdana", "Black", 16);
        document.addCharacter('0', "Verdana", "Black", 16);
        document.addCharacter('0', "Verdana", "Black", 16);

        // Display the document
        System.out.println("Displaying Document:");
        document.displayDocument();

        // Save the document
        FileHandler.saveDocument(document, "HelloWorldCS5800.txt");

        // Load the document
        Document loadedDocument = FileHandler.loadDocument("HelloWorldCS5800.txt");
        System.out.println("\nDisplaying Loaded Document:");
        loadedDocument.displayDocument();
    }
}
