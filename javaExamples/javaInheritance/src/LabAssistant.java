public class LabAssistant extends Assistant {

    public LabAssistant(String nameSurname, String mpno, String email, String department, String overTime, String officeTime) {
        super(nameSurname, mpno, email, department, overTime, officeTime);
    }

    public void labEntry() {
        System.out.println(this.getNameSurname() + " laboratuvara giriş yaptı.");
    }
}