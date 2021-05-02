package PhoneBookOop;

import PhoneBook.NumberType;

public class WorkContact extends PhoneContact{
    public WorkContact() {
        super();
        System.out.println("Tworzę obiekt typu work contact-konstruktor bez parametrów.");
    }

    public WorkContact(String name, String surname, String phoneNumber, int age) {
        super(name, surname, phoneNumber, age);
        System.out.println("Tworzę obiekt typu work contact-kostruktor z 5 parametrami");
    }

    /*@Override
    public void printContact(PhoneContact phoneContact) {
        System.out.println("Telefon firmowy");
        super.printContact(phoneContact);
    }

    @Override
    public void printContactCard(PhoneContact phoneContact) {
        System.out.println("Telefon firmowy");
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
        System.out.println("Numer telefomu: " + phoneNumber +" " + numberType3.getFullname());
    }

    @Override
    public String getContactRaw(int id, String name, String surname, int age, String phoneNumber, boolean isMobile, PhoneBook.NumberType numberType3) {

        return (id + ";" + name + ";" + surname + ";" + age + ";" + phoneNumber + ";" + isMobile + ";" + numberType);
    }

    @Override
    public String getContact(int id, String name, String surname, String phoneNumber, int age, NumberType numberType3) {

        return (id +" | " + name + " | " + surname + " | " + age + " | " + phoneNumber + " | " + numberType);
    }
}
