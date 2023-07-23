import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x ,y=0;
        int total = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Sayıyı Giriniz");
        x = scan.nextInt();

        for (int i =0; i<=x;i++){

            if(i %12 == 0){
                System.out.println(i);
                total+=i;
                y++;
            }
            }if(y>0){
                double avarage = total / y;
                System.out.println("Avarage : "+ avarage);
        }

    }
}