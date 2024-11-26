public class KitkatHandler extends SnackDispenseHandler {
    @Override
    public void handleRequest(String snackName, Driver Driver) {
        if ("KitKat".equalsIgnoreCase(snackName)) {
            System.out.println("Handling KitKat...");
            Driver.dispenseSnack();
        } else if (nextHandler != null) {
            nextHandler.handleRequest(snackName, Driver);
        } else {
            System.out.println("Snack not available.");
        }
    }
}
