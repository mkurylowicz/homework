package PhoneBookOop;

public class PhoneContact {
    private int id;// = 1;
    private String name;// = "Anna";
    private String surname;// = "";
    private String phoneNumber;// = "666999666";
    private int age;// = 20;
    private boolean isHidden;// = false;

    public PhoneContact(){
        this.id = 1;
        this.name = "Anna";
        this.surname = "Motyl";
        this.phoneNumber = "666999666";
        this.age = 20;
        this.isHidden = false;
    }

    public PhoneContact(int id, String name, String surname, String phoneNumber, int age){
        this.id = id;
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
}

