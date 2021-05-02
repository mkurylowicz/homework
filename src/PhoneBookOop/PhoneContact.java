package PhoneBookOop;

import PhoneBook.NumberType;

public abstract class PhoneContact implements PrintableContact,StorableContact{
    private int id;// = 1;
    private String name;// = "Anna";
    private String surname;// = "";
    private String phoneNumber;// = "666999666";
    private int age;// = 20;
    private boolean isHidden;// = false;
    private static int numsCount = 0;

    NumberType numberType = PhoneBook.NumberType.MOBI;
    NumberType numberType2 = PhoneBook.NumberType.HOME;
    NumberType numberType3 = NumberType.WORK;

    public PhoneContact(){
        numsCount++;
        this.id = numsCount;
        this.name = "Anna";
        this.surname = "Motyl";
        this.phoneNumber = "666999666";
        this.age = 20;
        this.isHidden = false;

    }

    public PhoneContact(String name, String surname, String phoneNumber, int age){

        numsCount++;
        this.id = numsCount;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.age = age;

        if(this.phoneNumber.length() != 9)
            this.phoneNumber = "000000000";
        if(this.name.isEmpty())
            this.name ="NIEZNANY";
        if(surname.isEmpty())
            this.surname ="NIEZNANY";
        if(phoneNumber.isEmpty())
            this.phoneNumber ="NIEZNANY";

    }

    public  void printInfo(){
        System.out.println("Id: " + this.id);
        System.out.println("Imię: " + this.name);
        System.out.println("Nazwisko: " + this.surname);
        System.out.println("Wiek: " + this.age);
        System.out.println("Numer telefomu: " + this.phoneNumber);
    }


    public void setName(String name){this.name = name;}
    public String getName(){return this.name;}

    public void setSurname(String surname){this.surname = surname;}
    public String getSurname(){return this.surname;}

    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}
    public String getPhoneNumber(){return this.phoneNumber;}

    public void setAge(int age){this.age = age;}
    public Integer getAge(){return this.age;}

    public void setHidden(boolean isHidden){this.isHidden = isHidden;}
    public boolean isHidden(){return this.isHidden;}

    public void printContact(PhoneContact phoneContact){

        /*if(this.phoneNumber.length() != 9)
            this.phoneNumber = "000000000";
        if(this.name.isEmpty())
            this.name ="NIEZNANY";
        if(this.surname.isEmpty())
            this.surname ="NIEZNANY";
        if(this.phoneNumber.isEmpty())
            this.phoneNumber ="NIEZNANY";*/
        System.out.println("printContact");
        System.out.println(this.id +" | " + this.name + " | " + this.surname + " | " + this.age + " | " + this.phoneNumber);
    }

    public void printContactCard(PhoneContact phoneContact){

        /*if(this.phoneNumber.length() != 9)
            this.phoneNumber = "000000000";
        if(this.name.isEmpty())
            this.name ="NIEZNANY";
        if(this.surname.isEmpty())
            this.surname ="NIEZNANY";
        if(this.phoneNumber.isEmpty())
            this.phoneNumber ="NIEZNANY";*/

        System.out.println("printContactCard:");
        System.out.println("Id: " + this.id);
        System.out.println("Imię: " + this.name);
        System.out.println("Nazwisko: " + this.surname);
        System.out.println("Wiek: " + this.age);
        System.out.println("Numer telefomu: " + this.phoneNumber );

    }

    public String getContact(PhoneContact phoneContact){
       /* if(this.phoneNumber.length() != 9)
            this.phoneNumber = "000000000";
        if(this.name.isEmpty())
            this.name ="NIEZNANY";
        if(this.surname.isEmpty())
            this.surname ="NIEZNANY";
        if(this.phoneNumber.isEmpty())
            this.phoneNumber ="NIEZNANY";*/
        return (this.id +" | " + this.name + " | " + this.surname + " | " + this.age + " | " + this.phoneNumber);
    }

    public String getContactRaw(PhoneContact phoneContact) {

        /*if(this.phoneNumber.length() != 9)
            this.phoneNumber = "000000000";
        if(this.name.isEmpty())
            this.name ="NIEZNANY";
        if(this.surname.isEmpty())
            this.surname ="NIEZNANY";
        if(this.phoneNumber.isEmpty())
            this.phoneNumber ="NIEZNANY";*/
        return (this.id + ";" + this.name + ";" + this.surname + ";" + this.age + ";" + this.phoneNumber + ";");
    }
}

