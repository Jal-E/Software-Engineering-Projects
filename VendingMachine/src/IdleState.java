public class IdleState implements StateOfDriver {
    private Driver Driver;

    public IdleState(Driver Driver) {
        this.Driver = Driver;
    }

    @Override
    public void selectSnack(String snackName) {
        System.out.println("Snack selected: " + snackName);
        Driver.setSelectedSnack(snackName);
        Driver.setState(Driver.getWaitingForMoneyState());
    }

    @Override
    public void insertMoney(double amount) {
        System.out.println("Please select a snack first.");
    }

    @Override
    public void dispenseSnack() {
        System.out.println("No snack selected.");
    }
}
