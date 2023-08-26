public class Instructor extends Academician {
    private String doorNo;

    public Instructor(String nameSurname, String mpno, String email, String department, String title, String doorNo) {
        super(nameSurname, mpno, email, department, title);
        this.doorNo = doorNo;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public void senateMeeting() {
        System.out.println(this.getNameSurname() + " ve diğer çalışanlar ile senato toplandı.");
    }

    public void takeExam() {
        System.out.println(this.getNameSurname() + " sınav yaptı.");
    }
}
