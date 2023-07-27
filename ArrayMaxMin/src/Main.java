import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int n;
        int[] List = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println("Önce Listeyi Sıralayalım");
        Arrays.sort(List);
        System.out.println(Arrays.toString(List));
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz ?");
        n = scan.nextInt();

        int mindif = 0;
        int maxdif = List[List.length - 1]+1;
        for (int i:List){
            if (i<n && i>mindif){
                mindif =i;
            }

        }
        for (int i:List)
            { if (i>n && i<maxdif){
                maxdif =i;
            }
        }
        System.out.println("En küçük :" + mindif);
        System.out.println("En büyük :" + maxdif);
        }
    }
