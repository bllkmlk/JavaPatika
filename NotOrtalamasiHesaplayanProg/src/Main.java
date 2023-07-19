import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mat,fizik,kimya,turkce,tarih,muzik;
        double ortalama;

        System.out.println("Matematik Notunuz : ");
        mat = scan.nextInt();

        System.out.println("Fizik Notunuz :" );
        fizik = scan.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = scan.nextInt();

        System.out.println("Türkçe Notunuz : ");
        turkce = scan.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = scan.nextInt();

        System.out.println("Müzik Notunuz : ");
        muzik = scan.nextInt();

        int toplam =( mat + fizik + kimya + turkce + tarih + muzik);
         ortalama = toplam/6 ;
        System.out.println("Ortamalama : " + ortalama );

        String sonuc =(ortalama >60)? "Geçtiniz " : "Kaldıdnız";
        System.out.println(sonuc);


    }
}