
package W6.Model;
public class UserOption {

    private String id;
    private String fullName;
    private String group;
    private String address;
    private String phone;
    private String lastName;
    private String firstName;

    public UserOption(String id, String fullName, String group, String address, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.group = group;
        this.address = address;
        this.phone = phone;
        setFirstName();
        setLastName();
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName() {
        try {
            this.firstName = fullName.substring(0, fullName.indexOf(" "));
        } catch (Exception e) {
            this.firstName = fullName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        try {
            this.lastName = fullName.substring(fullName.indexOf(" "));
        } catch (Exception e) {
            this.lastName = " ";
        }
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void display() {
        System.out.printf("%-5s %-15s %-15s %-15s %-10s %-10s %-10s%n", id,fullName,firstName,lastName,group,address,phone);
    }
 
}