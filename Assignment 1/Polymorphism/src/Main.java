public class Main {
    public static void main(String[] args) {
        // Create objects of Ship, CruiseShip, and CargoShip
        Ship generalShip = new Ship("General Ship", "1990");
        CruiseShip cruiseShip = new CruiseShip("Carnival Cruise", "2005", 3000);
        CargoShip cargoShip = new CargoShip("Atlantic Cargo", "2010", 50000);

        // Create an array of Ship type
        Ship[] ships = new Ship[3];
        ships[0] = generalShip;
        ships[1] = cruiseShip;
        ships[2] = cargoShip;

        // Loop through the array and call print() method
        for (Ship ship : ships) {
            ship.print();
        }
    }
}
