public class CreateAddressBook {

        static void addContact(Person person) {
            person.setFirstName("firstName");
            person.setLastName("lastName");
            person.setAddress("Boduppal");
            person.setCity("city");
            person.setState("state");
            person.setZipCode("zipCode");
            person.setPhoneNumber("phoneNumber");
            person.setEmail("email");

        }
        static void editContact(Person person){

            person.setFirstName("FIRSTNAME");
            person.setLastName("LASTNAME");
            person.setAddress("ADDRESS");
            person.setCity("CITY");
            person.setState("STATE");
            person.setZipCode("ZIPCODE");
            person.setPhoneNumber("NUMBER");
            person.setEmail("EMAIL");

    }

        static void deleteContact(Person person) {
            person.setFirstName("Null");
            person.setLastName("Null");
            person.setAddress("Null");
            person.setCity("Null");
            person.setState("Null");
            person.setZipCode("Null");
            person.setPhoneNumber("Null");
            person.setEmail("Null");

    }

}
