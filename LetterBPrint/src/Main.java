import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String[][] List = new String[6][4];
        for ( int i =0; i< List.length; i++){
            for (int j =0; j< List[i].length; j++){
                if (i == 0 || i==2 || i==5  ){
                    List[i][j] = "* ";
                }else if (j ==0 || j==3){
                    List[i][j] ="* ";
                }else {
                    List[i][j] = "  ";
                }
            }
        }
        for (String[] row:List){
            for (String col :row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}