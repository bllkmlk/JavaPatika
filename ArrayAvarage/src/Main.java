public class Main {
    public static void main(String[] args) {
        int[] List = {1,2,3,4,5};
        double harmonic  = 0.0;
        System.out.println("Array Harmonic :");
        for (int i =0;i<List.length; i++){
            harmonic += 1.0/List[i];

           System.out.println(harmonic + "  ");
        }
        double avarage = List.length / harmonic;
        System.out.println("Harmonic Avarage :" + avarage);
    }
}