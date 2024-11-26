public class PepsiHandler extends SnackDispenseHandler {
    @Override
    public void handleRequest(String snackName, Driver Driver) {
        if ("Pepsi".equalsIgnoreCase(snackName)) {
            System.out.println("Handling Pepsi...");
            Driver.dispenseSnack();
        } else if (nextHandler != null) {
            nextHandler.handleRequest(snackName, Driver);
        } else {
            System.out.println("Snack not available.");
        }
    }
}
