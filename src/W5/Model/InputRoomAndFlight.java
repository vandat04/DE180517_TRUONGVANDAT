package W5.Model;

import java.util.ArrayList;

public class InputRoomAndFlight {

    static public String getBookingID(ArrayList<Reservation> reservationList) {
        String output;
        boolean check;
        while (true) {
            check = true;
            output = CheckValid.getValue("ID: ");
            if (CheckValid.checkID(output)) {
                for (Reservation x : reservationList) {
                    if (x.getBookingID().equals(output)) {
                        System.err.println("Please Enter Booking ID Again. It is exist");
                        check = false;
                        break;
                    }
                }
            }
            if (check == true) {
                break;
            }
        }
        return output;
    }

    static public String getCustomerName() {
        String output;
        while (true) {
            output = CheckValid.getValue("Name: ");
            if (CheckValid.checkFullName(output)) {
                break;
            }
        }
        return output;
    }

    static public String getRoomNumbers(ArrayList<Reservation> reservationList) {
        String output;
        boolean check;
        while (true) {
            check = true;
            output = CheckValid.getValue("RoomNumbers: ");
            if (CheckValid.checkRoomNumbers(output)) {
                for (Reservation x : reservationList) {
                    if (x.getRoomNumbers().equals(output)) {
                        System.err.println("Please Enter Booking ID Again. It is exist");
                        check = false;
                        break;
                    }
                }
            }
            if (check == true) {
                break;
            }
        }
        return output;
    }

    static public String getPhoneNumber() {
        String output;
        while (true) {
            output = CheckValid.getValue("Phone: ");
            if (CheckValid.checkPhoneNumber(output)) {
                break;
            }
        }
        return output;
    }

    static public String getBookingDate() {
        String output;
        while (true) {
            output = CheckValid.getValue("BookingDate: ");
            if (CheckValid.checkDateForBooking(output)) {
                break;
            }
        }
        return output;
    }

    static public String getPickUpTime(String bookingDate) {
        String output;
        while (true) {
            output = CheckValid.getValue("PickUpTime: ");
            if (CheckValid.checkPickUpTime(bookingDate, output)) {
                break;
            }
        }
        return output;
    }

    static public String getAirportPickUp() {
        String output;
        while (true) {
            output = CheckValid.getValue("Need Airport Pick Up: (Y/N) ");
            if (CheckValid.checkYandN(output)) {
                output = CheckValid.normalizeName(output);
                break;
            }
        }
        return output;
    }

    static public String getSeat(ArrayList<Reservation> reservationList) {
        String output;
        boolean check;
        while (true) {
            check = true;
            output = CheckValid.getValue("Seat: ");
            for (Reservation x : reservationList) {
                if (x.getFlightInformation().getSeatNumbers().equals(output)) {
                    System.err.println("Please Enter Seat Again. It is exist");
                    check = false;
                    break;
                }
            }
            if (check == true) {
                break;
            }
        }
        return output;
    }

    static public void createNew(ArrayList<Reservation> reservationList) {
        System.out.println("*** Create new reservation ***");
        String bookingID, customerName, roomNumbers, phoneNumber, bookingDate, flightNumber, seatNumbers, airportPickUpTime, pickUpTime;
        bookingID = getBookingID(reservationList);
        customerName = getCustomerName();
        phoneNumber = getPhoneNumber();
        roomNumbers = getRoomNumbers(reservationList);
        bookingDate = getBookingDate();
        airportPickUpTime = getAirportPickUp();
        switch (airportPickUpTime) {
            case "Y": {
                flightNumber = CheckValid.getValue("Flight: ");
                seatNumbers = getSeat(reservationList);
                pickUpTime = getPickUpTime(bookingDate);
                reservationList.add(new Reservation(bookingID, customerName, phoneNumber, bookingDate, roomNumbers, new FlightInformation(flightNumber, seatNumbers, pickUpTime)));
                System.out.println("Information saved successfully.");
            }
            break;
            case "N":
                reservationList.add(new Reservation(bookingID, customerName, phoneNumber, bookingDate, roomNumbers, new FlightInformation()));
                System.out.println("Information saved successfully.");
                break;
        }
    }

    static public void updateInformaion(ArrayList<Reservation> reservationList) {
        System.out.println("*** Update reservation ***");
        String findAgain = "Y";
        String searchID;
        int check;
        String changeInfor = "";
        while (!findAgain.equals("N")) {
            check =0;
            searchID = CheckValid.getValue("ID: ");
            for (Reservation x : reservationList) {
                if (x.getBookingID().equals(searchID)) {
                    check = 1;
                    System.out.println("ID - Name - Phone - RoomNumbers - BookingDate - Flight - Seat - TimePickUp");
                    System.out.println(x.toString());
                    System.out.println("If you do not want to change the information, just press enter to skip.");
                    while (true) {
                        changeInfor = CheckValid.getValue("Name: ");
                        if (changeInfor.equals("")) {
                            break;
                        } else {
                            if (CheckValid.checkFullName(changeInfor)) {
                                x.setCustomerName(CheckValid.normalizeName(changeInfor));
                                break;
                            }
                        }
                    }
                    while (true) {
                        changeInfor = CheckValid.getValue("Phone: ");
                        if (changeInfor.equals("")) {
                            break;
                        } else {
                            if (CheckValid.checkPhoneNumber(changeInfor)) {
                                x.setPhoneNumber(changeInfor);
                                break;
                            }
                        }
                    }
                    while (true) {
                        changeInfor = CheckValid.getValue("RoomNumbers: ");
                        if (changeInfor.equals("")) {
                            break;
                        } else {
                            if (CheckValid.checkRoomNumbers(changeInfor)) {
                                x.setRoomNumbers(changeInfor);
                                break;
                            }
                        }
                    }
                    while (true) {
                        changeInfor = CheckValid.getValue("BookingDate: ");
                        if (changeInfor.equals("")) {
                            break;
                        } else {
                            if (CheckValid.checkDateForBooking(changeInfor)) {
                                x.setBookingDate(changeInfor);
                                break;
                            }
                        }
                    }
                    while (true) {
                        String need = CheckValid.getValue("Need airpor pick up? (Y/N) ");
                        if (need.equals("")) {
                            break;
                        }
                        switch (need) {
                            case "Y": {
                                while (true) {
                                    changeInfor = CheckValid.getValue("Flight: ");
                                    if (changeInfor.equals("")) {
                                        break;
                                    } else {
                                        x.getFlightInformation().setFilghtNumber(need);
                                        break;
                                    }
                                }
                                while (true) {
                                    changeInfor = CheckValid.getValue("Seat: ");
                                    if (changeInfor.equals("")) {
                                        break;
                                    } else {
                                        x.getFlightInformation().setSeatNumbers(changeInfor);
                                        break;
                                    }
                                }
                                while (true) {
                                    changeInfor = CheckValid.getValue("PickUpTime: ");
                                    if (changeInfor.equals("")) {
                                        break;
                                    } else {
                                        if (CheckValid.checkPickUpTime(x.getDateTime(), changeInfor)) {
                                            x.getFlightInformation().setAirportPickUpTime(changeInfor);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;

                            case "N": {
                                FlightInformation fi = new FlightInformation();
                                x.getFlightInformation().setFilghtNumber(fi.getFilghtNumber());
                                x.getFlightInformation().setSeatNumbers(fi.getSeatNumbers());
                                x.getFlightInformation().setAirportPickUpTime(fi.getAirportPickUpTime());
                            }
                            break;
                        }
                        break;
                    }
                    System.out.println("ID - Name - Phone - RoomNumbers - BookingDate - Flight - Seat - TimePickUp");
                    System.out.println(x.toString());
                    System.out.println("Information saved successfully.");
                    break;
                }
            }
            if (check == 0) {
                System.err.println("No information found");
            }
            findAgain = CheckValid.getValue("You want to find again? (Y/N): ");
        }
    }

    static public void deleteInformation(ArrayList<Reservation> reservationList) {
        System.out.println("*** Delete reservation ***");
        String findAgain = "Y";
        String decide;
        String searchID;
        while (!findAgain.equals("N")) {
            searchID = CheckValid.getValue("ID: ");
            for (Reservation x : reservationList) {
                if (x.getBookingID().equals(searchID)) {
                    System.out.println("ID - Name - Phone - RoomNumbers - BookingDate - Flight - Seat - TimePickUp");
                    System.out.println(x.toString());
                    decide = CheckValid.getValue("Are you sure you want to delete this information? (Y/N): ");
                    if (decide.equals("Y")) {
                        reservationList.remove(x);
                        break;
                    }
                }
            }
            findAgain = CheckValid.getValue("You want to find again? (Y/N): ");
        }
    }

    static public void printFlightInformattion(ArrayList<Reservation> reservationList) {
        System.out.println("*** Flight Information ***");
        if (!reservationList.isEmpty()) {
            System.out.println("ID - Name - Phone - Flight - Seat - TimePickUp");
            for (Reservation x : reservationList) {
                System.out.println(x.toStringFilghtInformation());
            }
        } else {
            System.out.println("No information to view");
        }
    }

    static public void printAll(ArrayList<Reservation> reservationList) {
        System.out.println("*** Reservation Information ***");
        if (!reservationList.isEmpty()) {
            System.out.println("ID - Name - Phone - RoomNumbers - BookingDate - Flight - Seat - TimePickUp");
            for (Reservation x : reservationList) {
                System.out.println(x.toString());
            }
        } else {
            System.out.println("No information to view");
        }
    }
}
