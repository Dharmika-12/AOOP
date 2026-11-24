// Sealed class

sealed class ParkingSpot
    permits CarParkingSpot,
            BikeParkingSpot,
            ElectricParkingSpot {

    public void display() {

        System.out.println("Parking spot");
    }
}

// Permitted subclass 1

final class CarParkingSpot extends ParkingSpot {

    public void display() {

        System.out.println("Car Parking Spot");
    }
}

// Permitted subclass 2

final class BikeParkingSpot extends ParkingSpot {

    public void display() {

        System.out.println("Bike Parking Spot");
    }
}

// Permitted subclass 3

final class ElectricParkingSpot extends ParkingSpot {

    public void display() {

        System.out.println("Electric Vehicle Parking Spot");
    }
}

// Main class

public class Sealed_types {

    public static void main(String[] args) {

        ParkingSpot car = new CarParkingSpot();

        ParkingSpot bike = new BikeParkingSpot();

        ParkingSpot electric = new ElectricParkingSpot();

        System.out.println("=== Parking Spot Details ===");

        car.display();

        bike.display();

        electric.display();
    }
}