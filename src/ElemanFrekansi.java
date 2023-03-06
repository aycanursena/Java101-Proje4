import java.util.Arrays;

public class ElemanFrekansi {
    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 4, 6, 2, 9, 10, 21, 1, 33, 9, 1, 4, 4, 14, 14};

        int miktar = 0 ;
        Arrays.sort(list);

        for (int i = 0 ; i < list.length ; i++){
            miktar = 0;
            for (int j = 0 ; j < list.length  ; j++){
                if (list[i] == list[j]){
                    miktar++;
                }
            }
            if(i == 0 && list[i+1] == list[i])
            {
                System.out.println((list[i] + " sayısı " + miktar  + " kere tekrar edildi."));
            }

            if(i == 0 && list[i+1] != list[i])
            {
                System.out.println((list[i] + " sayısı " + miktar  + " kere tekrar edildi."));
            }

            if(i != 0 && list[i-1] != list[i])
            {
                System.out.println((list[i] + " sayısı " + miktar  + " kere tekrar edildi."));
            }
        }
    }
}
