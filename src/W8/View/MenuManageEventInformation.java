package W8.View;

import W8.Control.ManageEventInformationFunction;
import W8.Model.Event;
import java.util.ArrayList;

public class MenuManageEventInformation extends Menu {

    static String title = "*** Event Management ***";
    static String[] mchon = {"Create new event", "Print all seminar", "Print all talkshow", "Print all", "Search", "Exit"};
    static ArrayList<Event> list;
    static ManageEventInformationFunction fn;

    public MenuManageEventInformation() {
        super(title, mchon);
        list = new ArrayList<>();
        fn = new ManageEventInformationFunction();
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                fn.createNewEvent(list);
                break;
            case 2:
                fn.printSeminars(list);
                break;
            case 3:
                fn.printTalkshows(list);
                break;
            case 4:
                fn.printAll(list);
                break;
            case 5:
                for (String x : fn.search(list)) {
                    System.out.println(x);
                }
                break;
            case 6:

                break;
            default:
                System.out.println("Enter choice again");
        }
    }

}
