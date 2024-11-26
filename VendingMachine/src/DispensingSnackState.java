public class DispensingSnackState implements StateOfDriver {
    private Driver Driver;

    public DispensingSnackState(Driver Driver) {
        this.Driver = Driver;
    }

    @Override
    public void selectSnack(String snackName) {
        System.out.println("Snack is being dispensed. Please wait.");
    }

    @Override
    public void insertMoney(double amount) {
        System.out.println("Cannot accept money now, dispensing snack.");
    }

    @Override
    public void dispenseSnack() {
        Snack snack = Driver.getSelectedSnack();
        if (snack.getQuantity() > 0) {
            snack.reduceQuantity();
            System.out.println("Dispensed: " + snack.getName());
            Driver.setInsertedMoney(0);
            Driver.setState(Driver.getIdleState());
        } else {
            System.out.println("Out of stock. Returning money: $" + Driver.getInsertedMoney());
            Driver.setInsertedMoney(0);
            Driver.setState(Driver.getIdleState());
        }
    }
}
