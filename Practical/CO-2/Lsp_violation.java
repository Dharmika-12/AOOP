class ParkingSpot {

    public void parkVehicle(String vehicle) {

        System.out.println("Vehicle parked");
    }
}

class ElectricChargingSpot extends ParkingSpot {

    @Override
    public void parkVehicle(String vehicle) {

        throw new UnsupportedOperationException(
            "Charging required before parking"
        );
    }
}

public class Lsp_violation {

    public static void main(String[] args) {

        ParkingSpot spot = new ElectricChargingSpot();

        spot.parkVehicle("EV123");
    }
}