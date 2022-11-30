import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        int i = 1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    Enter The following number:
                     [A/a]. To Display Add Contact
                     [E/e]. To Display Edit Contact
                     [D/d]. To Display Contact
                     [R/r]. To Display Delete Contact""");
            String input = scanner.next();
            switch (input) {

                case "a", "A" -> CreateAddressBook.addContact();

                case "D", "d" -> CreateAddressBook.displayContact();

                case "R", "r" -> {
                    CreateAddressBook.deleteContact();
                    System.out.println("Please Enter Person Contact Detail");
                    CreateAddressBook.addContact();
                }

                case "E", "e" -> CreateAddressBook.editContact();

                default ->  {
                    System.out.println("Error("+i+"): invalid input entered for the interstate question");
                i++;
                }
            }
        }while (i<=3);{
            System.out.println("Too many args Edite ended!");
        }
    }
}
