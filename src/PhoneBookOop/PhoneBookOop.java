package PhoneBookOop;

public class PhoneBookOop {
    public static void main(String[] args) {
        PhoneContact phoneContact1 = new PhoneContact(1, "Stefania","Piekara" ,"654321987",35);
        phoneContact1.printInfo();

        PhoneContact phoneContact2 = new PhoneContact(1, "Stefania","" ,"654321987",35);
        phoneContact2.printInfo();
    }

}
