import java.util.ArrayList;

import java.util.List;

public class AddressBookMain {

    private final String firstName;
    private final String lastName;
    private final String address;
    private final String city;
    private final String state;
    private final String phoneNumber;
    private final String email;

    public AddressBookMain(String firstName, String lastName, String address, String city, String state, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.email = email;
        }
        public static void main(String[] args) {
        List<AddressBookMain> list = new ArrayList<>();
        AddressBookMain a1 = new AddressBookMain("jason", "Adidela", "Boduppal", "Hyderabad", "Telangana", "7013770364", "jasonadidela@gmail.com");
        AddressBookMain a2 = new AddressBookMain("jason", "Adidela", "Boduppal", "Hyderabad", "Telangana", "7013770364", "jasonadidela@gmail.com");
        AddressBookMain a3 = new AddressBookMain("jason", "Adidela", "Boduppal", "Hyderabad", "Telangana", "7013770364", "jasonadidela@gmail.com");
        list.add(a1);
        list.add(a2);
        list.add(a3);
            for (AddressBookMain a : list) {
                System.out.println("First Name: " + a.firstName + "\nLast Name:  " + a.lastName + "\nAddress: " + a.address + "\nCity: " + a.city + "\nState: " + a.state + "\nPhone No: " + a.phoneNumber + "\nEmail: " + a.email);
            }
    }
}