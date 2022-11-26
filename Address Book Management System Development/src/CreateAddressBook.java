public class CreateAddressBook {

        static void addContact(Person person) {
            person.setFirstName("Jason");
            person.setLastName("Adidela");
            person.setAddress("Boduppal");
            person.setCity("Hyderabad");
            person.setState("Telangana");
            person.setZipCode("500092");
            person.setPhoneNumber("+91-7013770364");
            person.setEmail("jasonadidela@gmail.com");

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
            person.setFirstName(null);
            person.setLastName(null);
            person.setAddress("Null");
            person.setCity("Null");
            person.setState("Null");
            person.setZipCode("Null");
            person.setPhoneNumber("Null");
            person.setEmail("Null");

    }

}
