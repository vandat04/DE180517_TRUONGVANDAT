
package W6.Model;

import java.util.List;

public class ContactList {
    
    public static void addContact(List<UserOption> contactList) {
        String name = GetInformation.getStringAndNormalize("Enter Name: ");
        String group = GetInformation.getStringAndNormalize("Enter Group: ");
        String address = GetInformation.getStringAndNormalize("Enter Address: ");
        String phone = GetInformation.getPhoneNumber("Enter Phone Number: ");
        String id = ""+ (contactList.size() + 1);      
        contactList.add(new UserOption(id, name, group, address, phone));
        System.out.println("Successful");
    }
    
    public static void displayList(List<UserOption> contactList) {
        System.out.println("-----------------------------------Display all Contact---------------------------------");
        System.out.printf("%-5s %-15s %-15s %-15s %-10s %-10s %-10s%n", "ID", "Name", "First Name", "Last Name", "Group", "Address", "Phone");
        for (UserOption x : contactList) {
            x.display();
        }
    }
    
    public static void deleteContact(List<UserOption> contactList) {
        String id = GetInformation.getInteger("Enter ID: ");
        int count =0;
        for(UserOption x : contactList){
            if(x.getID().equals(id) ) {
                contactList.remove(x);
                System.out.println("Successful");
                break;
            }
        }
        if(count == 0 )  System.out.println("ID is not exist");
    }
}
