package W8.Control;

import W8.Model.Event;
import W8.Model.Seminar;
import W8.Model.Talkshow;
import java.util.ArrayList;

public class ManageEventInformationFunction {

    public void createNewEvent(ArrayList<Event> list) {
        String checkType;
        while (true) {
            checkType = CheckValid.getValues("Seminar (S) or Talkshow (T): ");
            if (CheckValid.checkType(checkType, "Seminar", "Talkshow")) {
                break;
            }
        }
        int ID = list.size() + 1;
        String eventName, eventDate, location = null, numberOfTopics, speakerNames;
        eventName = CheckValid.getValues("Name: ");
        while (true) {
            while (true) {
                eventDate = CheckValid.getValues("Date: ");
                if (CheckValid.checkDate(eventDate)) {
                    break;
                }
            }
            while (true) {
                location = CheckValid.getValues("Location: ");
                if (location.trim().equals("")) {
                    System.err.println("Data input is invalid");
                } else {
                    break;
                }
            }
            boolean checkTimeAndLocation = true;
            for (Event x : list) {
                if (x.getLocation().equals(location) && x.getEventDate().equals(eventDate)) {
                    System.err.println("Conflict in time and location with other events");
                    checkTimeAndLocation = false;
                    break;
                }
            }
            if (checkTimeAndLocation == true) {
                break;
            }
        }
        if (checkType.equalsIgnoreCase("Seminar") || checkType.equalsIgnoreCase("S")) {
            while (true) {
                numberOfTopics = CheckValid.getValues("Number of topics: ");
                if (CheckValid.checkNumberRange(numberOfTopics, 0)) {
                    list.add(new Seminar(numberOfTopics, ID, eventName, eventDate, location));
                    break;
                }
            }
        } else {
            while (true) {
                speakerNames = CheckValid.getValues("Speaker Names: ");
                if (!speakerNames.trim().equals("")) {
                    list.add(new Talkshow(speakerNames, ID, eventName, eventDate, location));
                    break;
                } else {
                    System.err.println("Data input is invalid");
                }

            }
        }
    }

    public void printSeminars(ArrayList<Event> list) {
        System.out.println("*** Seminars ***");
        int count = 0;
        for (Event x : list) {
            if (x instanceof Seminar) {
                System.out.println("No: " + (++count));
                System.out.println(x.toString());
            }
        }
    }

    public void printTalkshows(ArrayList<Event> list) {
        System.out.println("*** Talkshows ***");
        int count = 0;
        for (Event x : list) {
            if (x instanceof Talkshow) {
                System.out.println("No: " + (++count));
                System.out.println(x.toString());
            }
        }
    }

    public void printAll(ArrayList<Event> list) {
        int count = 0;
        for (Event x : list) {
            if (x instanceof Talkshow) {
                System.out.println("No: " + (++count));
                System.out.println(x.getEventID() + " (Talkshow)\n" + x.element());
            } else {
                System.out.println("No: " + (++count));
                System.out.println(x.getEventID() + " (Seminar)\n" + x.element());
            }
        }
    }

    public ArrayList<String> search(ArrayList<Event> list) {
        ArrayList<String> searchList = new ArrayList<>();
        String searchWord = CheckValid.getValues("Data: ");
        int count = 0;
        searchList.add("");
        for (Event x : list) {
            String[] parts = x.getAll().split("\\s+");
            for (String part : parts) {
                if (part.contains(searchWord)) {
                    count += 1;
                    if (x instanceof Talkshow) {
                        searchList.add("No: " + count + "\n" + x.getEventID() + " (Talkshow)\n" + x.element());
                        break;
                    } else {
                        searchList.add("No: " + count + "\n" + x.getEventID() + " (Seminar)\n" + x.element());
                        break;
                    }
                }
            }
        }
        searchList.set(0, "Found " + count + " events with the word \"" + searchWord + "\"");
        return searchList;
    }
}
