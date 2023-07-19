public class Student {
    Course mat;
    Course fizik;
    Course biyo;
    String name;
    String stuNO;
    String classes;
    double average;
    boolean isPass;
    Course szlmat;
    Course szlfizik;
    Course szlbiyo;

    public Student(String name, String stuNO, String classes, Course mat, Course fizik, Course biyo, Course szlmat, Course szlfizik, Course szlbiyo) {
        this.name = name;
        this.stuNO = stuNO;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.biyo = biyo;
        this.average = 0.0;
        this.isPass = false;
        this.szlmat = szlmat;
        this.szlfizik = szlfizik;
        this.szlbiyo = szlbiyo;
        calcAverage();
    }

    public void addBulkExamNote(int note1, int note2, int note3, int szlnot1, int szlnot2, int szlnot3) {
        if (note1 >= 0 && note1 <= 100) {
            this.mat.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.fizik.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.biyo.note = note3;
        }
        if (szlnot1 >= 0 && szlnot1 <= 100) {
            this.szlmat.note = szlnot1;
        }
        if (szlnot2 >= 0 && szlnot2 <= 100) {
            this.szlfizik.note = szlnot2;
        }
        if (szlnot3 >= 0 && szlnot3 <= 100) {
            this.szlbiyo.note = szlnot3;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.biyo.note == 0) {
            System.out.println("Notu Yanlış Girdiniz");
        } else {
            this.isPass = isControlPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçtiniz");
            } else {
                System.out.println("Sınıfta Kaldınız");
            }
        }
    }

    public void calcAverage() {
        this.average = ((this.mat.note * 0.8) + (this.szlmat.note * 0.2) +
                (this.fizik.note * 0.8) + (this.szlfizik.note * 0.2) +
                (this.biyo.note * 0.8) + (this.szlbiyo.note * 0.2)) / 3.0;
    }

    public boolean isControlPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println(this.mat.name + " Notu: " + this.mat.note);
        System.out.println(this.fizik.name + " Notu: " + this.fizik.note);
        System.out.println(this.biyo.name + " Notu: " + this.biyo.note);
    }
}

