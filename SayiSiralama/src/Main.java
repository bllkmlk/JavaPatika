import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b,c;
        System.out.println("1.Sayı :");
        a = scan.nextInt();
        System.out.println("2.Sayı :");
        b = scan.nextInt();
        System.out.println("3.Sayı :");
        c = scan.nextInt();
        if((a<b) && (a<c)){
            if(b<c){
                System.out.println("a<b<c");
            }else {
                System.out.println("a<c<b");
            }
        }
        if((b<a) && (b<c)){
            if(a<c){
                System.out.println("b<a<c");
            }else{
                System.out.println("b<c<a");
            }
        }
        if((c<a) && (c<b)){
            if(b<a){
                System.out.println("c<b<a");
            }else{
                System.out.println("c<a<b");
            }
        }
    }
}