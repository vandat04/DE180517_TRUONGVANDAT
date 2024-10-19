package W8.Model;

public class Seminar extends Event {

    private String numberOfTopics;

    public Seminar(String numberOfTopics, int enventID, String eventName, String eventDate, String Location) {
        super(enventID, eventName, eventDate, Location);
        this.numberOfTopics = numberOfTopics;
    }

    public Seminar() {
        this.numberOfTopics = "";
    }

    public String getNumberOfTopics() {
        return numberOfTopics;
    }

    public void setNumberOfTopics(String numberOfTopics) {
        this.numberOfTopics = numberOfTopics;
    }

    @Override
    public String toString() {
        return super.toString()+ "Number of topics: "+numberOfTopics; 
    }
}
