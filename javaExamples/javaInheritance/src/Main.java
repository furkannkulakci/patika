public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Michael Scott", "1122334455", "michaelscott@outlook.com");
        e1.entry();
        e1.exit();
        e1.entryDiningHall();
        e1.exitDiningHall();
        System.out.println("-------------------------------------");

        Academician acd1 = new Academician("Pam Beesly", "99887766554422", "pambeesly@outlook.com", "Computer Science", "Professor");
        acd1.lesson();
        System.out.println("-------------------------------------");

        Instructor i1 = new Instructor("Dwight Schrute", "22113345687", "dwightschrute@outlook.com", "Computer Science", "Instructor", "221");
        i1.senateMeeting();
        System.out.println(i1.getDoorNo());
        i1.takeExam();
        System.out.println("-------------------------------------");

        Assistant ast1 = new Assistant("Stanley Hudson", "8778984565", "stanleyhudson@outlook.com", "Computer Science", "Assistant", "09.00 - 21.00");
        ast1.entryDiningHall();
        ast1.takeQuiz();
        System.out.println("-------------------------------------");

        Officer o1 = new Officer("Jim Halpert", "22886654632", "jimhalpert@outlook.com", "Information Tecnology", "09.00 - 18.00");
        o1.work();
        o1.exitDiningHall();
        System.out.println("-------------------------------------");

        InformationProcessing ip1 = new InformationProcessing("Angela Martin", "6661115558", "angelamartin@outlook.com", "Information Processing", "09.00 - 18.00");
        ip1.networkSetup();
        ip1.exit();
        System.out.println("-------------------------------------");

        Security s1 = new Security("Darryl Philibin", "44889933256", "darrylphilibin@outlook.com", "Security", "07.00 - 21.00", "puzzle");
        s1.entry();
        s1.watch();
    }
}