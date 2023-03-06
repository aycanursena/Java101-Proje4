import java.util.Scanner;

public class TranspozeAlma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int eleman;
        int satir1, sutun1;
        System.out.print("Satır sayısı : ");
        satir1 = inp.nextInt();
        System.out.print("Sütun sayısı : ");
        sutun1 = inp.nextInt();
        int[][] matris1 = new int[satir1][sutun1];
        int[][] matris2 = new int[sutun1][satir1];

        for (int x = 0; x < matris1.length; x++){
            for (int y = 0; y < matris1[x].length; y++){
                System.out.print("Eleman giriniz : ");
                eleman = inp.nextInt();
                matris1[x][y] = eleman;
                matris2[y][x] = eleman;
            }
        }

        System.out.println("--- 1. matris ---");
        for (int[] row : matris1){
            for (int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.println("--- 1. matrisin transpozu ---");
        for (int[] row : matris2){
            for (int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
