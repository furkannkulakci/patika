public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course kimya;
    Course tarih;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course kimya, Course tarih) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.kimya = kimya;
        this.tarih = tarih;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int kimya, int tarih) {

        if (mat >= 0 && mat <= 100) {
            this.mat.examNote = mat;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.examNote = kimya;
        }

        if (tarih >= 0 && tarih <= 100) {
            this.tarih.examNote = tarih;
        }
    }

    public void addBulkVerbalNote(int mat, int kimya, int tarih) {

        if (mat >= 0 && mat <= 100) {
            this.mat.verbalNote = mat;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.verbalNote = kimya;
        }

        if (tarih >= 0 && tarih <= 100) {
            this.tarih.verbalNote = tarih;
        }
    }

    public void isPass() {
        if (this.mat.examNote == 0 || this.kimya.examNote == 0 || this.tarih.examNote == 0 || this.mat.verbalNote == 0
                || this.kimya.verbalNote == 0 || this.tarih.verbalNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.mat.examNote * 0.80 + (this.mat.verbalNote * 0.20))
                + (this.kimya.examNote * 0.80 + (this.kimya.verbalNote * 0.20))
                + (this.tarih.examNote * 0.80 + (this.tarih.verbalNote * 0.20))) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sınav Notu : " + this.mat.examNote + " || Matematik Sözlü Notu : " + this.mat.verbalNote);
        System.out.println("Kimya Sınav Notu : " + this.kimya.examNote + " || Kimya Sözlü Notu : " + this.kimya.verbalNote);
        System.out.println("Tarih Sınav Notu : " + this.tarih.examNote + " || Tarih Sözlü Notu : " + this.tarih.verbalNote);
    }

}