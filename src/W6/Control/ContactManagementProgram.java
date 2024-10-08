package W6.Control;

import W6.Model.ContactList;
import W6.Model.UserOption;
import W6.View.Menu;
import java.util.ArrayList;
import java.util.List;

public class ContactManagementProgram extends Menu {

    private List<UserOption> contactList;
    static String title = "=========== Contact program============ ";
    static String[] arr = {"Add a contact", "Display all Contact", "Delete a contact", "Exit"};

    public ContactManagementProgram() {
        super(title, arr);
        this.contactList = new ArrayList<>();
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1: {
                ContactList.addContact(contactList);
            }
            break;
            case 2: {
                ContactList.displayList(contactList);
            }
            break;
            case 3: {
                ContactList.deleteContact(contactList);
            }
            break;
            default:
                System.out.println("Enter choice again");
        }
    }
}
