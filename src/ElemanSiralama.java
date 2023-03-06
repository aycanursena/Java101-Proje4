import java.util.Scanner;
import java.util.Arrays;

public class ElemanSiralama {
    public static void main(String[] args) {
        int eleman, dizi_boyut;
        Scanner inp = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz : ");
        dizi_boyut = inp.nextByte();
        int[] list = new int[dizi_boyut];

        for (int x = 0; x < list.length; x++){
            System.out.print("Eleman giriniz : ");
            eleman = inp.nextInt();
            list[x] = eleman;
        }
        System.out.println("Dizi : " + Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Sıralı dizi : " + Arrays.toString(list));
    }
}
