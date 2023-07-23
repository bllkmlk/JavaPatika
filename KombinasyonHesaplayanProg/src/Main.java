import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        int r;
        int total1 = 1 ,total2 = 1, total3 = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısını giriniz");
        n = scan.nextInt();
        System.out.println("R sayısını giriniz");
        r = scan.nextInt();

        for(int i=1 ; i<=n; i++){
            total1 = total1*i;
        }
        for(int ii =1; ii <=r; ii++){
            total2 = total2*ii;
        }
        for (int iii = 1; iii <=n-r; iii++ ){
            total3 = total3*iii;
        }

        System.out.println("C(n,r) : " + total1 / (total2 * total3 ) );



    }
}