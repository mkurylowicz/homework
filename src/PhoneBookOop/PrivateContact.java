package PhoneBookOop;

import PhoneBook.NumberType;

public class PrivateContact extends PhoneContact{

    public PrivateContact() {
        super();
        System.out.println("Tworzę obiekt typu private contact-konstruktor bez parametrów.");
    }

    public PrivateContact(String name, String surname, String phoneNumber, int age) {
        super(name, surname, phoneNumber, age);
        System.out.println("Tworzę obiekt typu private contact-kostruktor z 5 parametrami");
    }

   /* @Override
    public void printContact(PhoneContact phoneContact) {
        System.out.println("Telefon prywatny");
        super.printContact(phoneContact);
    }

    @Override
    public void printContactCard(PhoneContact phoneContact) {
        System.out.println("Telefon prywatny");
        super.printContactCard(phoneContact);
    }

    @Override
    public String getContact(PhoneContact phoneContact) {
        return super.getContact(phoneContact);
    }

    @Override
    public String getContactRaw(PhoneContact phoneContact) {
        return super.getContactRaw(phoneContact);
    }*/
   @Override
   public void printContact(int id, String name, String surname, String phoneNumber, int age) {

       System.out.println("printContact");
       System.out.println(id +" | " + name + " | " + surname + " | " + age + " | " + phoneNumber);
   }

    @Override
    public void printContactCard(int id, String name, String surname, String phoneNumber, int age) {

        System.out.println("Id: " + id);
        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + surname);
        System.out.println("Wiek: " + age);
        System.out.println("Numer telefomu: " + phoneNumber +" " + numberType2.getFullname());
    }

    @Override
    public String getContactRaw(int id, String name, String surname, int age, String phoneNumber, boolean isMobile, PhoneBook.NumberType numberType2) {

        return (id + ";" + name + ";" + surname + ";" + age + ";" + phoneNumber + ";" + isMobile + ";" + numberType2);
    }

    @Override
    public String getContact(int id, String name, String surname, String phoneNumber, int age, NumberType numberType2) {

        return (id +" | " + name + " | " + surname + " | " + age + " | " + phoneNumber + " | " + numberType2);
    }
}
