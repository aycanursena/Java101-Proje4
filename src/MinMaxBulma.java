import java.util.Arrays;
import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();

        Arrays.sort(dizi);
        for (int a = 0; a < dizi.length; a++){
            if (dizi[a] > sayi){
                System.out.println("Girilen sayıdan büyük en yakın sayı : " + dizi[a]);
                break;
            }
        }
        for (int b = 0; b < dizi.length; b++){
            if (dizi[b] > sayi){
                System.out.println("Girilen sayıdan küçük en yakın sayı : " + dizi[b-1]);
                break;
            }
        }
    }
}
