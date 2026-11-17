class Public_setters{ 
    private final int spotId; 
    private boolean available = true; 
    private String vehicleNumber; 
 
    // Constructor 
    public Public_setters(int spotId) { 
        if (spotId <= 0) { 
            throw new IllegalArgumentException("Invalid spot ID"); 
        } 
        this.spotId = spotId; 
    } 
 
    // Park a vehicle 
    public void park(String vehicleNumber) { 
        if (!available) { 
            throw new IllegalStateException("Spot already occupied"); 
        } 
 
        if (vehicleNumber == null || vehicleNumber.isBlank()) { 
            throw new IllegalArgumentException("Vehicle number required"); 
        } 
 
        this.vehicleNumber = vehicleNumber; 
        this.available = false; 
    } 
 
    // Release parking spot 
    public void release() { 
        if (available) { 
            throw new IllegalStateException("Spot is already free"); 
        } 
 
        this.vehicleNumber = null; 
        this.available = true; 
    } 
 
    // Display parking spot details 
    public void displayStatus() { 
        System.out.println("Spot ID: " + spotId); 
        System.out.println("Available: " + available); 
        System.out.println("Vehicle Number: " + vehicleNumber); 
        System.out.println("-------------------------"); 
    } 
 
    // Main method - execution starts here 
    public static void main(String[] args) { 
 
        Public_setters spot = new Public_setters(101); 
 
        System.out.println("Initial Parking Status:"); 
        spot.displayStatus(); 
 
        System.out.println("Parking a vehicle..."); 
        spot.park("TS09AB1234"); 
        spot.displayStatus(); 
 
        System.out.println("Releasing the parking spot..."); 
        spot.release(); 
        spot.displayStatus(); 
    } 
} 