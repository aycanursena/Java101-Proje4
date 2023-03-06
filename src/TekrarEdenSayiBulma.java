public class TekrarEdenSayiBulma {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {3, 7, 3, 3, 4, 6, 2, 9, 10, 21, 1, 33, 9, 1, 4, 4, 14, 14};
        int[] tekrarEden = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if((i != j) && (list[i] == list[j]) && list[i] % 2 == 0){
                    if (!isFind(tekrarEden, list[i])){
                        tekrarEden[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int value : tekrarEden){
            if (value != 0){
                System.out.print(value + " ");
            }
        }
    }
}
