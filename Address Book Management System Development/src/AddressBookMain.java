import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("""
                Enter The following number:
                 1. To Display Add Contact
                 2. To Display Edit Contact
                 3. To Display Delete Contact""");
        int num = scanner.nextInt();
        Person person = new Person();
        switch (num) {

            case 1 -> {
                System.out.println("Person Contact Details");
                CreateAddressBook.addContact(person);
            }
            case 2 -> {
                System.out.println("Person Contact Details After edited");
                CreateAddressBook.editContact(person);
            }
            case 0 -> {
                System.out.println("Person Contact Deleted");
                CreateAddressBook.deleteContact(person);
            }
            default -> System.out.println("Invalid Entry");
        }
    }
}
