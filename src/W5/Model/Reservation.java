package W5.Model;

public class Reservation {

    private String bookingID;
    private String customerName;
    private String phoneNumber;
    private String bookingDate;
    private String roomNumbers;
    private FlightInformation flightInformation;

    public Reservation(String bookingID, String customerName, String phoneNumber, String bookingDate, String roomNumbers, FlightInformation flightInformation) {
        this.bookingID = bookingID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.bookingDate = bookingDate;
        this.roomNumbers = roomNumbers;
        this.flightInformation = flightInformation;
    }

    public String getDateTime() {
        return bookingDate;
    }

    public void setDateTime(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getRoomNumbers() {
        return roomNumbers;
    }

    public void setRoomNumbers(String roomNumbers) {
        this.roomNumbers = roomNumbers;
    }

    public FlightInformation getFlightInformation() {
        return flightInformation;
    }

    public void setFlightInformation(FlightInformation flightInformation) {
        this.flightInformation = flightInformation;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return bookingID + " - " + customerName + " - " + phoneNumber + " - " + roomNumbers + " - " + bookingDate + " - " + flightInformation;
    }

    public String toStringFilghtInformation() {
        return bookingID + " - " + customerName + " - " + phoneNumber + " - " + flightInformation;
    }

}
