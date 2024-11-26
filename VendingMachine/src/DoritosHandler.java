public class DoritosHandler extends SnackDispenseHandler {
    @Override
    public void handleRequest(String snackName, Driver Driver) {
        if ("Doritos".equalsIgnoreCase(snackName)) {
            System.out.println("Handling Doritos...");
            Driver.dispenseSnack();
        } else if (nextHandler != null) {
            nextHandler.handleRequest(snackName, Driver);
        } else {
            System.out.println("Snack not available.");
        }
    }
}
