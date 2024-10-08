package W5.Control;

import W5.Model.InputRoomAndFlight;
import W5.Model.Reservation;
import W5.View.Menu;
import java.util.ArrayList;

public class RoomAndFlightManager extends Menu {

    static String title = "*** Reservation Management ***";
    static String[] mchon = {"Create new reservation", "Update reservation", "Delete reservation", "Print Flight Information", "Print all", "Exit"};
    static ArrayList<Reservation> reservationList;

    public RoomAndFlightManager() {
        super(title, mchon);
        reservationList = new ArrayList<>();
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                InputRoomAndFlight.createNew(reservationList);
                break;
            case 2:
                InputRoomAndFlight.updateInformaion(reservationList);
                break;
            case 3:
                InputRoomAndFlight.deleteInformation(reservationList);
                break;
            case 4:
                InputRoomAndFlight.printFlightInformattion(reservationList);
                break;
            case 5:
                InputRoomAndFlight.printAll(reservationList);
                break;
            case 6:
                System.out.println("Bye");
                break;
            default:
                System.out.println("Enter choice again!!!");
        }
    }

    
    
}
