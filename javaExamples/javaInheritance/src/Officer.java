public class Officer extends Employee {
    private String department;
    private String overtime;

    public Officer(String nameSurname, String mpno, String email, String department, String overtime) {
        super(nameSurname, mpno, email);
        this.department = department;
        this.overtime = overtime;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOvertime() {
        return overtime;
    }

    public void setOvertime() {
        this.overtime = overtime;
    }

    public void work() {
        System.out.println(this.getNameSurname() + " çalışmaya başladı.");
    }
}
