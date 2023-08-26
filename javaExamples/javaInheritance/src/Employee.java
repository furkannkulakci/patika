public class Employee {
    private String nameSurname;
    private String mpno;
    private String email;

    public Employee(String nameSurname, String mpno, String email) {
        this.nameSurname = nameSurname;
        this.mpno = mpno;
        this.email = email;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getMpno() {
        return mpno;
    }

    public void setMpno(String mpno) {
        this.mpno = mpno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void entry() {
        System.out.println(this.getNameSurname() + " üniversiteye giriş yaptı.");
    }

    public void exit() {
        System.out.println(this.getNameSurname() + " üniversiteden çıkış yaptı.");
    }

    public void entryDiningHall() {
        System.out.println(this.getNameSurname() + " yemekhaneye giriş yaptı.");
    }

    public void exitDiningHall() {
        System.out.println(this.getNameSurname() + " yemekhaneden çıkış yaptı.");
    }
}
