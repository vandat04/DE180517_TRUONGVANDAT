package W5.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FlightInformation {

    private String filghtNumber;
    private String seatNumbers;
    private String pickUpTime;

    public FlightInformation(String filghtNumber, String seatNumbers, String pickUpTime) {
        this.filghtNumber = filghtNumber;
        this.seatNumbers = seatNumbers;
        this.pickUpTime = pickUpTime;
    }

    public FlightInformation() {
        this.filghtNumber = "0";
        this.seatNumbers = "0";
        this.pickUpTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a"));
    }

    public String getFilghtNumber() {
        return filghtNumber;
    }

    public void setFilghtNumber(String filghtNumber) {
        this.filghtNumber = filghtNumber;
    }

    public String getSeatNumbers() {
        return seatNumbers;
    }

    public void setSeatNumbers(String seatNumbers) {
        this.seatNumbers = seatNumbers;
    }

    public String getAirportPickUpTime() {
        return pickUpTime;
    }

    public void setAirportPickUpTime(String airportPickUpTime) {
        this.pickUpTime = airportPickUpTime;
    }

    @Override
    public String toString() {
        return filghtNumber + " - " + seatNumbers + " - " + pickUpTime;
    }

}
