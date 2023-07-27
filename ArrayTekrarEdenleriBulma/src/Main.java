import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] List = {77, 5, 62, 1, 8,56,72,96,14,12,28,32,395, 2, 77, 5,  3,};
        Arrays.sort(List);
        System.out.println("Diziyi Sıraya Alalım !" + Arrays.toString(List));
        int count = 0;
        for (int i = 0; i < List.length-1; i++) {
                if (List[i] == List[i + 1]) {
                    int number = List[i];
                    if (number % 2 == 0){
                        count++;
                        System.out.println(number + " ");
                    }
                }
        }
        if (count ==0){
            System.out.println("Tekrar eden çift bulunamadı..");
        }
    }
}