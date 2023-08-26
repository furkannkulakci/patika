public class Assistant extends Academician {
    private String officeTime;

    public Assistant(String nameSurname, String mpno, String email, String department, String title, String officeTime) {
        super(nameSurname, mpno, email, department, title);
        this.officeTime = officeTime;
    }

    public String getOfficeTime() {
        return officeTime;
    }

    public void setOfficeTime(String officeTime) {
        this.officeTime = officeTime;
    }

    public void takeQuiz() {
        System.out.println(this.getNameSurname() + " quiz yaptı.");
    }
}
