import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sınır Sayısını Giriniz :");
        n = scan.nextInt();

        for(int i=1; i<=n ; i*=4){
            System.out.println(i);
        }
        System.out.println("============");
        for(int ii =1; ii <= n; ii*=5 ){
            System.out.println(ii);
        }
    }
}