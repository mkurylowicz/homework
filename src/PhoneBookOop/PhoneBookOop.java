package PhoneBookOop;

import PhoneBook.NumberType;

public class PhoneBookOop {
    public static void main(String[] args) {
        //PhoneContact phoneContact1 = new PhoneContact(1, "Stefania","Piekara" ,"654321987",35);
        //phoneContact1.printInfo();

        //PhoneContact phoneContact2 = new PhoneContact(1, "Stefania","" ,"654321987",35);
        //phoneContact2.printInfo();


        PhoneContact[] phoneContactTab = new PhoneContact[5];
        phoneContactTab[0] = new MobileContact();
        phoneContactTab[1] = new PrivateContact();
        phoneContactTab[2] = new WorkContact();
        phoneContactTab[3] = new MobileContact();
        phoneContactTab[4] = new MobileContact();

        phoneContactTab[0].printContact(phoneContactTab[0]);
        phoneContactTab[1].printContact(phoneContactTab[1]);
        phoneContactTab[2].printContact(phoneContactTab[2]);

        phoneContactTab[0].printContactCard(phoneContactTab[0]);

        MobileContact mobileContact = new MobileContact();
        mobileContact.printContactCard(1,"Ola","Kot","565656",45);
        PrivateContact privateContact= new PrivateContact();
        privateContact.printContactCard(2,"Ola","Kot","565656",45);
        System.out.println(privateContact.getContactRaw(2,"Ola","Kot",45,"45",true,NumberType.HOME));

    }

}
