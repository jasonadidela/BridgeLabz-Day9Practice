public class AddressBook {

        public static void addContact(Person person) {
            person.setFirstName("firstName");

            person.setLastName("lastName");

            person.setAddress("Boduppal");

            person.setCity("city");

            person.setState("state");

            person.setZipCode("zipCode");

            person.setPhoneNumber("phoneNumber");

            person.setEmail("email");
        }
    public static void main(String[] args) {
            Person person = new Person();
            addContact(person);
    }
}
