enum SpotStatus {
    AVAILABLE, OCCUPIED
}

class ParkingSpot {

    private SpotStatus status;
    private String vehicleNumber;

    public void parkVehicle(String vehicle) {

        if (status == SpotStatus.OCCUPIED) {
            throw new IllegalStateException(
                "Spot already occupied"
            );
        }

        if (vehicle == null || vehicle.isBlank()) {
            throw new IllegalArgumentException(
                "Invalid vehicle"
            );
        }

        vehicleNumber = vehicle;
        status = SpotStatus.OCCUPIED;
    }
}

public class Parking_invariants {

    public static void main(String[] args) {

        ParkingSpot spot = new ParkingSpot();

        spot.parkVehicle("TS09AB1234");

        System.out.println("Vehicle parked successfully");
    }
}