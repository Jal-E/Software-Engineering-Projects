public class SnickersHandler extends SnackDispenseHandler {
    @Override
    public void handleRequest(String snackName, Driver Driver) {
        if ("Snickers".equalsIgnoreCase(snackName)) {
            System.out.println("Handling Snickers...");
            Driver.dispenseSnack();
        } else if (nextHandler != null) {
            nextHandler.handleRequest(snackName, Driver);
        } else {
            System.out.println("Snack not available.");
        }
    }
}