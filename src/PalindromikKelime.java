import java.util.Scanner;

public class PalindromikKelime {
    static boolean isPalindrome(String str){
        String reverse = "";
        for (int x = str.length() - 1; x >= 0; x--){
            reverse += str.charAt(x);
        }
        if (str.equals(reverse)){
            return true;
        }else
            return false;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir kelime giriniz : ");
        String gir_kelime = inp.nextLine();

        System.out.println(isPalindrome(gir_kelime));
    }
}
