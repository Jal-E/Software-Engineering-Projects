public class CheetosHandler extends SnackDispenseHandler {
    @Override
    public void handleRequest(String snackName, Driver Driver) {
        if ("Cheetos".equalsIgnoreCase(snackName)) {
            System.out.println("Handling Cheetos...");
            Driver.dispenseSnack();
        } else if (nextHandler != null) {
            nextHandler.handleRequest(snackName, Driver);
        } else {
            System.out.println("Snack not available.");
        }
    }
}
