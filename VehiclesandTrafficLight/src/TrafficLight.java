import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class TrafficLight {
    private List<AbstractVehicle> vehicles;
    private String color;

    public TrafficLight() {
        this.vehicles = new ArrayList<>();
        this.color = "red";
    }

    public void addObserver(AbstractVehicle vehicle) {
        this.vehicles.add(vehicle);
    }
    public void notifyObservers() {
        for (AbstractVehicle vehicle : vehicles) {
            vehicle.update(color);
        }
    }


    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        String color = "red";
        Random random = new Random();
        while (true) {
            System.out.println("Traffic Signal is: " + color);
            light.notifyObservers();
            if (color.equals("red")) {
                color = "green";
                sleep_random((random.nextInt(1000)));
            }
            else if (color.equals("green")) {
                color = "yellow";
                sleep_random((random.nextInt(1000)));
            }
            else if (color.equals("yellow")) {
                color = "red";
                sleep_random((random.nextInt(1000)));
            }
        }
    }
    public static void sleep_random(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.print("SLEEP ERROR");
        }
    }
}