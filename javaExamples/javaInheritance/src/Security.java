public class Security extends Officer {
    private String document;

    public Security(String nameSurname, String mpno, String email, String department, String overtime, String document) {
        super(nameSurname, mpno, email, department, overtime);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void watch() {
        System.out.println(this.getNameSurname() + " adlı güvenlik görevlisi değişti.");
    }
}
