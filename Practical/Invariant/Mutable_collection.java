
import java.util.ArrayList;
import java.util.List;

class ParkingSpot {

    private final int spotId;
    private boolean available = true;

    public ParkingSpot(int spotId) {
        this.spotId = spotId;
    }

    public int getSpotId() {
        return spotId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void park() {
        available = false;
    }

    @Override
    public String toString() {
        return "Spot ID: " + spotId +
               ", Available: " + available;
    }
}

class ParkingLot {

    private final List<ParkingSpot> spots;

    public ParkingLot(List<ParkingSpot> spots) {

        // Defensive copying: Copy IN
        this.spots = new ArrayList<>(spots);
    }

    public List<ParkingSpot> getSpots() {

        // Defensive copying: Copy OUT
        return new ArrayList<>(spots);
    }

    public void displayParkingLot() {

        for (ParkingSpot spot : spots) {
            System.out.println(spot);
        }
    }
}

public class Mutable_collection {

    public static void main(String[] args) {

        // Original list created by caller
        List<ParkingSpot> mySpots = new ArrayList<>();

        mySpots.add(new ParkingSpot(101));
        mySpots.add(new ParkingSpot(102));
        mySpots.add(new ParkingSpot(103));

        // Pass list to ParkingLot
        ParkingLot lot = new ParkingLot(mySpots);

        System.out.println("INITIAL PARKING LOT:");
        lot.displayParkingLot();

        // Modify caller's original list
        mySpots.clear();

        System.out.println("\nAFTER CLEARING ORIGINAL LIST:");
        lot.displayParkingLot();

        // Modify list returned by getter
        lot.getSpots().clear();

        System.out.println("\nAFTER CLEARING GETTER LIST:");
        lot.displayParkingLot();

        // Modify an element through getter
        lot.getSpots().get(0).park();

        System.out.println("\nAFTER MODIFYING PARKING SPOT:");
        lot.displayParkingLot();
    }
}
