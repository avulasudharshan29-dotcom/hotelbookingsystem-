import java.time.LocalDate;

public class Booking {
    private int bookingId;
    private Customer customer;
    private Room room;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Booking(int bookingId, Customer customer, Room room, LocalDate checkIn, LocalDate checkOut) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getBookingId() { return bookingId; }
    public Customer getCustomer() { return customer; }
    public Room getRoom() { return room; }
    public LocalDate getCheckIn() { return checkIn; }
    public LocalDate getCheckOut() { return checkOut; }
}
