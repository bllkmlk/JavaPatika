import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 , number2, secim;
        System.out.println("1.Sayıyı Giriniz");
        number1 = scan.nextInt();
        System.out.println("2.Sayıyı Giriniz");
        number2 = scan.nextInt();

        System.out.println("Yaptırmak İstediğiniz İşlemi Seçiniz");
        System.out.println(" 1-Toplama\n 2-Çıkarma\n 3-Bölme\n 4-Çarpma ");
        secim = scan.nextInt();

        switch(secim) {
            case 1:
                System.out.println("Toplama Sonuç =" + (number1 + number2));
                break;
            case 2:
                System.out.println(" Çıkarma Sonuç ="+(number1 - number2));
                break;

            case 3:
                System.out.println(" Bölme Sonuç = "+ (number1 / number2));
                break;

            case 4:
                System.out.println(" ÇarpmaSonuç = "+ (number1 * number2));
                break;
            default:
                System.out.println("Geçersiz İşlem,Lütfen Yaptırmak İstediğiniz İşlemi Seçiniz");
        }

    }
}