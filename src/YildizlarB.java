import java.util.Arrays;
import java.util.Scanner;

public class YildizlarB {
    public static void main(String[] args) {
        String [][] yildiz_b = new String[7][4];

        for (int i = 0; i < yildiz_b.length; i++){
            for (int j = 0; j < yildiz_b[i].length; j++){
                if (i == 0 || i == 3 || i == 6){
                    yildiz_b[i][j] = "*";
                }else if(j == 0 || j == 3){
                    yildiz_b[i][j] = "*";
                }else{
                    yildiz_b[i][j] = " ";
                }
            }
        }
        for (String [] row : yildiz_b){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}