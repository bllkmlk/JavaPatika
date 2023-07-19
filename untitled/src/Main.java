
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmutt Hoca","MAT","555");
        Teacher t2 = new Teacher("Graham Bell","FZK","0000");
        Teacher t3 = new Teacher("Külyutmaz","BIO","1111");

        Course szlmat = new Course("Matematik","101","MAT");
        Course szlfizik = new Course("Fizik","102","FZK");
        Course szlbiyo = new Course("Biyoloji","103","BIO");
        
        Course mat = new Course("Matematik" ,"101" ,"MAT" );
        mat.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","103","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban","123","4",mat, fizik, biyo,szlmat,szlfizik,szlbiyo);
        s1.addBulkExamNote(100,70,50,60,70,90);
        s1.isPass();


        Student s2 = new Student("Güdük Necmi","456","4",mat,fizik,biyo,szlmat,szlfizik,szlbiyo);
        s2.addBulkExamNote(70,80,90,60,80,60);
        s2.isPass();


        Student s3 = new Student("Bilal KAMALAK","424","4",mat,fizik,biyo,szlmat,szlfizik,szlbiyo);
        s3.addBulkExamNote(80,65,25,82,24,36);
        s3.isPass();


    }
}