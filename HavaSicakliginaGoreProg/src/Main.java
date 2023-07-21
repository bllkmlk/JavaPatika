import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int heat;
        System.out.println("Sıcaklığı Giriniz");
        heat = scan.nextInt();

        if(heat<=5){
            System.out.println("Kayak Yapabilirsiniz");
        }
        if(heat>=5){
            System.out.println("Sinemaya Gidebilirsiniz");
        }
        else if(5<=heat && heat<=15){
            System.out.println("Sinemaya Gidebilirsiniz");
        }
        if (heat>=10){
            System.out.println("Piknik Yapabilirsiniz");
        }
        else if(15<=heat && heat<=25){
            System.out.println("Piknik Yapabilirsiniz");
        }
        else if(heat>=25){
            System.out.println("Yüzmeye Gidebilirsiniz");
        }
    }
}