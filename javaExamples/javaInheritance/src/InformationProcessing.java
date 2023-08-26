public class InformationProcessing extends Officer {
    private String task;

    public InformationProcessing(String nameSurname, String mpno, String email, String department, String overtime) {
        super(nameSurname, mpno, email, department, overtime);
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void networkSetup() {
        System.out.println(this.getNameSurname() + " kurulumu başarıyla tamamladı.");
    }
}
