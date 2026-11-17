import java.time.LocalDateTime; 
class Booking { 
    private final int bookingId; 
    private final LocalDateTime startTime; 
    private final LocalDateTime endTime; 
    // Constructor 
    public Booking(int bookingId, 
                   LocalDateTime start, 
                   LocalDateTime end) { 
        if (start == null || end == null) { 
            throw new IllegalArgumentException( 
                "Start and End time are required"); 
        } 
        if (!end.isAfter(start)) { 
            throw new IllegalArgumentException( 
                "End must be after start"); 
        } 
        this.bookingId = bookingId; 
        // Safe because LocalDateTime is immutable 
        this.startTime = start; 
        this.endTime = end; 
    } 
    // Getter 
    public LocalDateTime getEndTime() { 
        return endTime; 
    } 
 
    public void displayBooking() { 
        System.out.println("Booking ID: " + bookingId); 
        System.out.println("Start Time: " + startTime); 
        System.out.println("End Time: " + endTime); 
    } 
 
    // Main method 
    public static void main(String[] args) { 
        LocalDateTime start =    LocalDateTime.of(2026, 11, 10, 9, 0); 
 
        LocalDateTime end =   LocalDateTime.of(2026, 11, 10, 17, 0); 
        Booking b = new Booking(501, start, end); 
        System.out.println("BOOKING DETAILS"); 
        b.displayBooking(); 
        System.out.println("\nChecking End Time:"); 
        System.out.println(b.getEndTime()); 
        System.out.println("\nBooking created successfully!"); 
    } 
}