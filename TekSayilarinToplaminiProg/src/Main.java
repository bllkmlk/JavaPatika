import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int total =0;

        do {
            System.out.print("Sayı Giriniz :");
            x = scan.nextInt();

            if( x % 2 == 0 && x % 4 ==0){
                total+= x;
            }
        }while ( x % 2== 0 );
        System.out.println("Toplam :"+total);
    }
}