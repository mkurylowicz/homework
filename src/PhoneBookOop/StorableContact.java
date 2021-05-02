package PhoneBookOop;

import PhoneBook.NumberType;

public interface StorableContact {
    String getContact(int id, String name, String surname, String phoneNumber, int age, NumberType numberType);
    String getContactRaw(int id, String name, String surname, int age, String phoneNumber, boolean isMobile, NumberType numberType);
}
