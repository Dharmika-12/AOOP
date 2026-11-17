
class ParkingSpot1 {

    private int spotId;
    private String vehicleNumber;
    private boolean occupied;

    // Constructor
    ParkingSpot1(int spotId) {

        if (spotId <= 0) {
            throw new IllegalArgumentException(
                "Invalid Parking Spot ID"
            );
        }

        this.spotId = spotId;
        this.occupied = false;
    }

    // Park vehicle
    public void parkVehicle(String vehicleNumber) {

        if (occupied) {
            throw new IllegalStateException(
                "Parking spot is already occupied"
            );
        }

        if (vehicleNumber == null ||
            vehicleNumber.isBlank()) {

            throw new IllegalArgumentException(
                "Vehicle number is required"
            );
        }

        this.vehicleNumber = vehicleNumber;
        occupied = true;
    }

    // Display details
    public void display() {

        System.out.println("Spot ID: " + spotId);
        System.out.println("Vehicle: " + vehicleNumber);
        System.out.println("Occupied: " + occupied);
    }
}

// Main class
public class Parkingspot {

    public static void main(String[] args) {

        ParkingSpot1 p1 = new ParkingSpot1(101);

        p1.parkVehicle("TS08AB1234");

        p1.display();
    }
}
