public class DiziOrt {
    public static void main(String[] args) {
        double[] sayilar = {1, 2, 3, 4, 5};

        double toplam1 = 0.0;
        for (int y = 0; y < sayilar.length; y++){
            toplam1 += 1 / sayilar[y];
        }
        System.out.println("Toplam : " + toplam1);
        System.out.println("Harmonik Ortalama : " + (toplam1 / sayilar.length));
    }
}