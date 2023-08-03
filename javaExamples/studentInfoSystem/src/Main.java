public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Cahit Arf", "MAT", "905309874565");
        Teacher t2 = new Teacher("Aziz Sancar", "KMY", "905456541213");
        Teacher t3 = new Teacher("İlber Ortaylı", "TRH", "905009877899");

        Course mat = new Course("Matematik", "Mat101", "MAT");
        Course kimya = new Course("Kimya", "Kmy101", "KMY");
        Course tarih = new Course("Tarih", "Trh101", "TRH");

        mat.addTeacher(t1);
        kimya.addTeacher(t2);
        tarih.addTeacher(t3);

        Student s1 = new Student("Fatmanur Göfer", 4, "17071998", mat, kimya, tarih);
        s1.addBulkExamNote(85, 70, 80);
        s1.addBulkVerbalNote(95, 75, 90);
        s1.isPass();

        Student s2 = new Student("Furkan Kulakcı", 4, "27091995", mat, kimya, tarih);
        s2.addBulkExamNote(45, 90, 85);
        s2.addBulkVerbalNote(50, 95, 85);
        s2.isPass();

        Student s3 = new Student("Kerem Alp Erşen", 1, "07072021", mat, kimya, tarih);
        s3.addBulkExamNote(75, 70, 90);
        s3.addBulkVerbalNote(80, 75, 95);
        s3.isPass();

    }
}