import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km ;
        double perkm = 2.20, total , startPrice = 10;
        Scanner scan = new Scanner(System.in);
        System.out.println("Mesafeyi km Cinsinden Giriniz : ");
        km = scan.nextInt();

        total =(km * perkm);
        total += startPrice;
        // Ödenecek Tutar min 20 TL olmalı 
        total = (total<20)? 20 : total;
        System.out.println("Ödenecek Tutar : " + total);



    }
}