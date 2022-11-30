import java.util.Scanner;

public class CreateAddressBook {

    static Person person = new Person();
    static Scanner value = new Scanner(System.in);


    static void addContact() {

            System.out.println("*************************************");
            System.out.println("Person Contact:" );
            System.out.println("Enter the First Name: ");
            person.setFirstName(value.next());
            System.out.println("Enter the Last Name: ");
            person.setLastName(value.next());
            System.out.println("Enter the Address: ");
            person.setAddress(value.next());
            System.out.println("Enter the City: ");
            person.setCity(value.next());
            System.out.println("Enter the State: ");
            person.setState(value.next());
            System.out.println("Enter the Zip Code: ");
            person.setZipCode(value.next());
            System.out.println("Enter the Phone No: ");
            person.setPhoneNumber(value.next());
            System.out.println("Enter the Email: ");
            person.setEmail(value.next());
            System.out.println("*************************************");

    }

    static void editContact() {
        System.out.println("Please Enter which one do you want to edit");
        String input = value.next();
        switch (input) {
            case "firstname" ->{
                System.out.println("Enter the First Name: ");
                person.setFirstName(value.next());
            }
            case "lastname" -> {
                System.out.println("Enter the Last Name: ");
                person.setLastName(value.next());
            }
            case "address" -> {
                System.out.println("Enter the Address: ");
                person.setAddress(value.next());
            }
            case "city" -> {
                System.out.println("Enter the City: ");
                person.setCity(value.next());
            }
            case "state" -> {
                System.out.println("Enter the State: ");
                person.setState(value.next());
            }
            case "zipcode" -> {
                System.out.println("Enter the Zip Code: ");
                person.setZipCode(value.next());
            }
            case "number" ->{
                System.out.println("Enter the Phone Number: ");
                person.setPhoneNumber(value.next());
            }
            case "email" -> {
                System.out.println("Enter the Email: ");
                person.setEmail(value.next());
            }
        }
    }

    static void deleteContact() {

                person = null;
                System.out.println("Person Contact Deleted");

    }

    static void displayContact() {
            System.out.println("Person Contact Detail");
            System.out.println("**********************************************" +
                    "\nFirst Name:\s" + person.getFirstName() +
                    "\nLast Name:\s" + person.getLastName() +
                    "\nAddress:\s" + person.getAddress() +
                    "\nCity:\s" + person.getCity() +
                    "\nState:\s" + person.getState() +
                    "\nZip Code:\s" + person.getZipCode() +
                    "\nPhone No:\s" + person.getPhoneNumber() +
                    "\nEmail:\s" + person.getEmail() +
                    "\n**********************************************");
    }
}
