package W8.Model;

public class Event {

    protected int eventID;
    protected String eventName, eventDate, Location;

    public Event(int eventID, String eventName, String eventDate, String Location) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.Location = Location;
    }

    public Event() {
        this.eventID = 0;
        this.eventDate = "";
        this.Location = "";
        this.eventDate = "";
    }

    public int getEventID() {
        return eventID;
    }

    public void setEnventID(int enventID) {
        this.eventID = enventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    @Override
    public String toString() {
        return "ID: " + eventID + "\n"
                + "Name: " + eventName + "\n"
                + "Date: " + eventDate + "\n"
                + "Location: " + Location + "\n";

    }

    public String element() {
        return "Name: " + eventName + "\n"
                + "Date: " + eventDate + "\n"
                + "Location: " + Location + "\n";
    }

    public String getAll(){
        return eventID+" "+eventName+" "+eventDate+" "+Location;
    }
}
