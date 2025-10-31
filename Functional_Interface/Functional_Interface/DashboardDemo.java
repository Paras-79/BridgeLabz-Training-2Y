interface VehicleDashboard {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery percentage not available for this vehicle.");
    }
}

class ElectricCar implements VehicleDashboard {
    public void displaySpeed() {
        System.out.println("Speed: 80 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery: 85%");
    }
}

class PetrolCar implements VehicleDashboard {
    public void displaySpeed() {
        System.out.println("Speed: 100 km/h");
    }
}

public class DashboardDemo {
    public static void main(String[] args) {
        VehicleDashboard ev = new ElectricCar();
        VehicleDashboard car = new PetrolCar();

        ev.displaySpeed();
        ev.displayBattery();
        car.displaySpeed();
        car.displayBattery();
    }
}
