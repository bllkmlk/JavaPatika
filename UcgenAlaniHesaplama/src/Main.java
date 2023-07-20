import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a,b,c,u,y;
        System.out.println("A Kenarının Uzunluğunu Giriniz");
        a = scan.nextInt();

        System.out.println("B Kenarının Uzunluğunu Griniz ");
        b = scan.nextInt();

        System.out.println("C kenarının Uzunluğunu Giriniz");
        c = scan.nextInt();

        u = (a+b+c);
        y = u / 2;
        System.out.println("Üçgenin Alanı : "+ (y * (y-a) *(y-b) * (y-c)));

    }
}