package PhoneBook;

public class PhoneBook {
    public static void main(String[] args) {
        int id = 1;
        String name = "Anna";
        String surname = "";
        String phoneNumber = "666999666";
        int age = 20;
        String contact = "2;Mia;MMM;12;789654123";
        boolean isHidden = false;

        // webinar 7
        NumberType numberType = NumberType.MOBI;
        NumberType numberType2 = NumberType.HOME;
        NumberType numberType3 = NumberType.WORK;

        printContactCard(id,name,surname,phoneNumber,age,numberType);
        printContact(id,name,surname,phoneNumber,age, numberType2);
        System.out.println(getContact(id,name,surname,phoneNumber,age,numberType3));
        System.out.println(calculateAverageAgeII(15,84,11));
        System.out.println(calculateAverageAgeFI(15,84,11));
        System.out.println(calculateAverageAgeIF(15,84,11));
        System.out.println(calculateAverageAgeFF(15,84,11));
        printContactCardS(contact);
        printContactS(contact);
        System.out.println(getContactRaw(id,name,surname,age,phoneNumber,isHidden,numberType));



    }
// webinar 2

    public static void printContactCard(int id, String name, String surname, String phoneNumber, int age, NumberType numberType){

        //modyfikacja z webinaru 6
        if((phoneNumber.length() <9)||(phoneNumber.length()>9))
            phoneNumber = "000000000";

        if(name.isEmpty())
            name ="NIEZNANY";
        if(surname.isEmpty())
            surname ="NIEZNANY";
        if(phoneNumber.isEmpty())
            phoneNumber ="NIEZNANY";

        System.out.println("Id: " + id);
        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + surname);
        System.out.println("Wiek: " + age);
        System.out.println("Numer telefomu: " + phoneNumber +" " + numberType.getFullname());

    }

    public static void printContact(int id, String name, String surname, String phoneNumber, int age, NumberType numberType){
        //modyfikacja z webinaru 6
        if((phoneNumber.length() <9)||(phoneNumber.length()>9))
            phoneNumber = "000000000";

        if(name.isEmpty())
            name ="NIEZNANY";
        if(surname.isEmpty())
            surname ="NIEZNANY";
        if(phoneNumber.isEmpty())
            phoneNumber ="NIEZNANY";
        System.out.println(id +" | " + name + " | " + surname + " | " + age + " | " + phoneNumber + " | " + numberType.getFullname());
    }

    public static String getContact(int id, String name, String surname, String phoneNumber, int age, NumberType numberType){
        //modyfikacja z webinaru 6
        if((phoneNumber.length() <9)||(phoneNumber.length()>9))
            phoneNumber = "000000000";

        if(name.isEmpty())
            name ="NIEZNANY";
        if(surname.isEmpty())
            surname ="NIEZNANY";
        if(phoneNumber.isEmpty())
            phoneNumber ="NIEZNANY";
        return (id +" | " + name + " | " + surname + " | " + age + " | " + phoneNumber + " | " + numberType);
    }

// webinar 3

    public static int calculateAverageAgeII(int a1, int a2, int a3){
        int average = 0;
        average = (a1 + a2 + a3)/3;
        return average;
    }

    public static float calculateAverageAgeFI(int a1, int a2, int a3){
        float sum = a1+a2+a3;
        return sum / 3;
    }
    public static int calculateAverageAgeIF(float a1, float a2, float a3){
        int average = 0;
        Float b;
        b=(a1 + a2 + a3)/3;
        average = b.intValue();
        return average;
    }
    public static float calculateAverageAgeFF(float a1, float a2, float a3){
        float average;
        average = (a1 + a2 + a3)/3;
        return average;
    }

// webinar 4

    public static void printContactCardS (String contact){
        //contact -> id;name;surname;age;number
        String textTablica[] = null;
        textTablica = contact.split(";");
        System.out.println("Id: " + textTablica[0]);
        System.out.println("Imię: " + textTablica[1]);
        System.out.println("Nazwisko: " + textTablica[2]);
        System.out.println("Wiek: " + textTablica[3]);
        System.out.println("Numer telefomu: " + textTablica[4]);

    }
    public static void printContactS(String contact){
        //contact -> id;name;surname;age;number
        String textTablica[] = null;
        textTablica = contact.split(";");
        System.out.println(textTablica[0] +" | " + textTablica[1] + " | " + textTablica[2] + " | " + textTablica[3] + " | " + textTablica[4]);
    }

    public static String getContactRaw(int id, String name, String surname, int age, String phoneNumber, boolean isMobile, NumberType numberType) {    ///???????? isMobile, brak id
        //modyfikacja z webinaru 6
        if((phoneNumber.length() <9)||(phoneNumber.length()>9))
            phoneNumber = "000000000";

        if(name.isEmpty())
            name ="NIEZNANY";
        if(surname.isEmpty())
            surname ="NIEZNANY";
        if(phoneNumber.isEmpty())
            phoneNumber ="NIEZNANY";
        return (id + ";" + name + ";" + surname + ";" + age + ";" + phoneNumber + ";" + isMobile + ";" + numberType);
    }


}
