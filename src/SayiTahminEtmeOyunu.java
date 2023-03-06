import java.util.Scanner;
import java.util.Arrays;

public class SayiTahminEtmeOyunu {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int hak = 0;
        int secim;
        int[] yanlisTercih = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println("gizli sayi : " + number);

        while (hak < 5) {
            System.out.print("Tahmininiz : ");
            secim = input.nextInt();

            if (secim < 0 || secim > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    hak++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - hak));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (secim == number){
                System.out.println("Tebrikler ! Doğru tahminde bulundunuz.");
                // döngüden çıkması için 'break;' komutu veriyoruz.
                isWin = true;
                break;
            }else {
                System.out.println("Hatalı bir sayı girdiniz !");
                if (secim > number){
                    System.out.println(secim + " gizli sayıdan büyüktür.");
                }else{
                    System.out.println(secim + " gizli sayıdan küçüktür.");
                }

                yanlisTercih[hak++] = secim;
                System.out.println("Kalan hak : " + (5 - hak));
            }
        }
        if (!isWin){
            System.out.println("Kaybettiniz !");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(yanlisTercih));
            }
        }
    }
}