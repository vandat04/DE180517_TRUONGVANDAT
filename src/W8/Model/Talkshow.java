
package W8.Model;

public class Talkshow extends Event{
    private String speakerNames;

    public Talkshow(String speakerNames, int enventID, String eventName, String eventDate, String Location) {
        super(enventID, eventName, eventDate, Location);
        this.speakerNames = speakerNames;
    }

    public Talkshow() {
        this.speakerNames ="";
    }

    public String getSpeakerNames() {
        return speakerNames;
    }

    public void setSpeakerNames(String speakerNames) {
        this.speakerNames = speakerNames;
    }

    @Override
    public String toString() {
        return super.toString() +"Speakers Name: "+speakerNames; 
    }
    
    
}
