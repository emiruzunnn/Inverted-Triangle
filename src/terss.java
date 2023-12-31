import java.util.Scanner;

public class terss {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak Sayisi: ");
        int basamakSayisi = scanner.nextInt();

        tersUcgenCiz(basamakSayisi);

        scanner.close();
    }

    public static void tersUcgenCiz(int basamakSayisi) {
        for (int i = basamakSayisi; i >= 1; i--) {
            // Boşlukları yazdır
            for (int j = 0; j < basamakSayisi - i; j++) {
                System.out.print(" ");
            }

            // Yıldızları yazdır
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Bir alt satıra geç
            System.out.println();
        }
    }
}
