import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double fiyat, kdvlifiyat ,kdv =0.18 ;
        System.out.println("Ürünün Fiyatını Giriniz");
        fiyat = scan.nextDouble();

        if (fiyat > 1000){
            System.out.println("Kdvli Fiyat :"+ (fiyat +(fiyat * 0.08)));
        } else {
            System.out.println("Kdvli Fiyat " + (fiyat +(fiyat * 0.18)));
        }


    }
}