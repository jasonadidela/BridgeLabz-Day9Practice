public class AddressBookMain {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Person Contact Details");
        CreateAddressBook.addContact(person);
        System.out.println("Person Contact Details After edited");
        //CreateAddressBook.editContact(person);
    }
}
