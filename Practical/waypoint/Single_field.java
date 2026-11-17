
class Single_field {

    private int spotId;

    // Constructor
    Single_field(int spotId) {

        if (spotId <= 0) {
            throw new IllegalArgumentException(
                "Spot ID must be positive"
            );
        }

        this.spotId = spotId;
    }

    // Display details
    void displayDetails() {
        System.out.println("Spot ID: " + spotId);
    }

    // Main method
    public static void main(String[] args) {

        Single_field p1 = new Single_field(101);

        p1.displayDetails();

        // Single_field p2 = new Single_field(-101);
    }
}
