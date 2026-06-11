package com.training.demo;

// parent class 
class DeliveryVehicle {
    String vehicleId;

    public DeliveryVehicle(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void dispatch() {
        System.out.println("Vehicle " + vehicleId + " is moving");
    }
}

// child class (overriding)
class DroneDelivery extends DeliveryVehicle {
    public DroneDelivery(String vehicleId) {
        super(vehicleId);
    }

    @Override
    public void dispatch() {
        System.out.println("Drone " + vehicleId + " is flying.");
    }
}

// method overloading example
class LogisticsManager {

    public void scheduleDelivery(String address) {
        System.out.println("Standard delivery scheduled to " + address);
    }

    public void scheduleDelivery(String address, String timeslot) {
        System.out.println("Standard delivery scheduled to " + address +
                " during time slot " + timeslot);
    }

    public void scheduleDelivery(int trackingId) {
        System.out.println("Querying tracking ID: " + trackingId);
    }
}

public class poly {
    public static void main(String[] args) {

        System.out.println("=== Overloading ===");

        LogisticsManager manager = new LogisticsManager();
        manager.scheduleDelivery("123 Kalana, Pune");
        manager.scheduleDelivery("SantaCruz West, Mumbai", "4pm-8pm");
        manager.scheduleDelivery(346985);

        System.out.println("\n=== Overriding ===");

        DeliveryVehicle reDeliveryVehicle = new DeliveryVehicle("van1");
        reDeliveryVehicle.dispatch();

        DeliveryVehicle Droneve = new DroneDelivery("Drone1");
        Droneve.dispatch();
    }
}
