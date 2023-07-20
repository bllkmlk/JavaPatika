import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik;

        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz :");
        mat = scan.nextInt();
        if(mat >=0 && mat<=100){
        }else{
            System.out.println("Not Değerleri 0-100 Arasında Olmalıdır.");
        }

        System.out.println("Fizik Notunuzu Giriniz :");
        fizik = scan.nextInt();
        if(fizik >=0 && fizik<=100){
        }else{
            System.out.println("Not Değerleri 0-100 Arasında Olmalıdır.");
        }

        System.out.println("Kimya Notunuzu Giriniz :");
        kimya = scan.nextInt();
        if(kimya >=0 && kimya<=100){
        }else{
            System.out.println("Not Değerleri 0-100 Arasında Olmalıdır.");
        }

        System.out.println("Türkçe Notunuzu Giriniz :");
        turkce = scan.nextInt();
        if(turkce >=0 && turkce<=100){
        }else{
            System.out.println("Not Değerleri 0-100 Arasında Olmalıdır.");
        }

        System.out.println("Müzik Notunuzu Giriniz :");
        muzik = scan.nextInt();
        if(muzik >=0 && muzik<=100){
        }else{
            System.out.println("Not Değerleri 0-100 Arasında Olmalıdır.");
        }

       double avarage = (mat + fizik + kimya + turkce + muzik) / 5.0 ;
       if (avarage<55){
           System.out.println("Sınıfta Kaldınız");
       }else {
           System.out.println("Sınıfı Geçtiniz");
       }
        System.out.println("Ortalamanız : "+ avarage);
    }
}