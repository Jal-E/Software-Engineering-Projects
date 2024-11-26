public class WaitingForMoneyState implements StateOfDriver {
    private Driver Driver;

    public WaitingForMoneyState(Driver Driver) {
        this.Driver = Driver;
    }

    @Override
    public void selectSnack(String snackName) {
        System.out.println("Snack already selected. Please insert money.");
    }

    @Override
    public void insertMoney(double amount) {
        System.out.println("Money inserted: $" + amount);
        Driver.setInsertedMoney(amount);
        if (amount >= Driver.getSelectedSnack().getPrice()) {
            Driver.setState(Driver.getDispensingSnackState());
        } else {
            System.out.println("Insufficient funds. Please insert more money.");
        }
    }

    @Override
    public void dispenseSnack() {
        System.out.println("Please insert enough money first.");
    }
}
