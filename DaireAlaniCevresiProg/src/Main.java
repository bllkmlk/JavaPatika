import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r ,a;
        double pi=3.14;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dairenin Yarıçapını Girniz : ");
        r = scan.nextInt();

        System.out.println("Merkez Açısının Ölçüsünü Giriniz : ");
        a = scan.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi *r;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
        // Merkez Açısı 
        double merkez = (pi * (r*r) * a) / 360;
        System.out.println("Merkez Açısı : " + merkez);






    }
}