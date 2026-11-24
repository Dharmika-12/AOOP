class ParkingSpot {

    public void parkVehicle(String vehicle) {

        System.out.println(
            "Vehicle parked: " + vehicle
        );
    }
}

class CarParkingSpot extends ParkingSpot {
}

class BikeParkingSpot extends ParkingSpot {
}

public class Caller_correct {

    public static void main(String[] args) {

        ParkingSpot[] spots = {
            new CarParkingSpot(),
            new BikeParkingSpot()
        };

        for (ParkingSpot spot : spots) {

            spot.parkVehicle("TS09AB1234");
        }
    }
}