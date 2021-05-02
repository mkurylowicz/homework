package PhoneBookOop;

public enum NumberType {
    HOME("Domowy"),
    MOBI("Komórkowy"),
    WORK("Służbowy");

    private String fullname;

    private NumberType(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return this.fullname;
    }
}
