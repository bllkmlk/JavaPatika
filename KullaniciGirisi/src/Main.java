import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String username,password ,evet,hayır,yenisifre;
        Scanner scan = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız :");
        username = scan.nextLine();

        System.out.println("Şifreniz : ");
        password = scan.nextLine();

        if(username.equals("PatikaDev")){
            System.out.println("Kullanıcı adı doğru");
        } else{
            System.out.println("Kullanıcı adı yanlış");
        }
        if(password.equals("P123")){
            System.out.println("Şifre doğru");
        }else {
            System.out.println("Şifreniz Yanlış Şifrenizi Sıfırlamak İster Misiniz? \nEvet veya Hayır ");
        }
        evet = scan.nextLine();
        if (evet.equals("Evet")){
            System.out.println("Yeni Şifrenizi Giriniz");
        }else{
            System.out.println("Giriş Yapamadınız...");
        }
        yenisifre = scan.nextLine();
        if(yenisifre.equals("P123")){
            System.out.println("Girdiğiniz Şifre Eski Şifreniz ile Aynı Olmamalı..");
        }else {
            System.out.println("Şifreniz Değiştirildi. \nLütfen Şifrenizi Unutmayınız.");
        }

    }
}