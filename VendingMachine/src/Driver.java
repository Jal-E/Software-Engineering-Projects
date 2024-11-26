import java.util.HashMap;
import java.util.Map;

public class Driver {
    private Map<String, Snack> snacks = new HashMap<>();
    private double insertedMoney = 0;
    private String selectedSnack;

    private StateOfDriver idleState;
    private StateOfDriver waitingForMoneyState;
    private StateOfDriver dispensingSnackState;
    private StateOfDriver currentState;

    private SnackDispenseHandler snackHandlerChain;

    public Driver() {
        idleState = new IdleState(this);
        waitingForMoneyState = new WaitingForMoneyState(this);
        dispensingSnackState = new DispensingSnackState(this);
        currentState = idleState;

        initializeSnackHandlers();
    }

    private void initializeSnackHandlers() {
        // Create snack handlers
        SnackDispenseHandler cokeHandler = new CokeHandler();
        SnackDispenseHandler pepsiHandler = new PepsiHandler();
        SnackDispenseHandler cheetosHandler = new CheetosHandler();
        SnackDispenseHandler doritosHandler = new DoritosHandler();
        SnackDispenseHandler kitkatHandler = new KitkatHandler(); // Fixed capitalization
        SnackDispenseHandler snickersHandler = new SnickersHandler();

        // Chain the handlers
        cokeHandler.setNextHandler(pepsiHandler);
        pepsiHandler.setNextHandler(cheetosHandler);
        cheetosHandler.setNextHandler(doritosHandler);
        doritosHandler.setNextHandler(kitkatHandler);
        kitkatHandler.setNextHandler(snickersHandler);

        // Set the start of the chain
        snackHandlerChain = cokeHandler;
    }

    public void addSnack(Snack snack) {
        snacks.put(snack.getName(), snack);
    }

    public Snack getSelectedSnack() {
        return snacks.get(selectedSnack);
    }

    public void setSelectedSnack(String snackName) {
        this.selectedSnack = snackName;
    }

    public void setInsertedMoney(double amount) {
        this.insertedMoney = amount;
    }

    public double getInsertedMoney() {
        return insertedMoney;
    }

    public void setState(StateOfDriver state) {
        this.currentState = state;
    }

    public StateOfDriver getIdleState() {
        return idleState;
    }

    public StateOfDriver getWaitingForMoneyState() {
        return waitingForMoneyState;
    }

    public StateOfDriver getDispensingSnackState() {
        return dispensingSnackState;
    }

    public void selectSnack(String snackName) {
        currentState.selectSnack(snackName);
    }

    public void insertMoney(double amount) {
        currentState.insertMoney(amount);
    }

    public void dispenseSnack() {
        currentState.dispenseSnack();
    }

    // Add method to handle snack requests via chain
    public void handleSnackRequest(String snackName) {
        snackHandlerChain.handleRequest(snackName, this);
    }

    public static void main(String[] args) {
        // Initialize Driver (acts as the Vending Machine)
        Driver driver = new Driver();
        driver.addSnack(new Snack("Coke", 1.5, 5));
        driver.addSnack(new Snack("Pepsi", 1.5, 5));
        driver.addSnack(new Snack("Cheetos", 2.0, 5));
        driver.addSnack(new Snack("Doritos", 2.0, 5));
        driver.addSnack(new Snack("KitKat", 1.0, 5));
        driver.addSnack(new Snack("Snickers", 1.5, 1));

        // Test snack selection and dispensing
        System.out.println("Test Case 1: Dispense Coke");
        driver.selectSnack("Coke");
        driver.insertMoney(1.5);
        driver.handleSnackRequest("Coke");

        System.out.println("\nTest Case 2: Dispense Snickers (last one)");
        driver.selectSnack("Snickers");
        driver.insertMoney(1.5);
        driver.handleSnackRequest("Snickers");

        System.out.println("\nTest Case 3: Out of stock for Snickers");
        driver.selectSnack("Snickers");
        driver.insertMoney(1.5);
        driver.handleSnackRequest("Snickers");
    }
}
