public class AddressBookMain {
    public static void main(String[] args) {
        Person person = new Person();
        CreateAddressBook.addContact(person);
        CreateAddressBook.editContact(person);
    }
}
