import java.util.Scanner;
public class ödev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Lütfen pozitif bir tamsayı girin.");
            return;
        }
        System.out.print("1. sayıyı girin: ");
        int enBuyuk = scanner.nextInt();
        int enKucuk = enBuyuk;

        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". sayıyı girin: ");
            int sayi = scanner.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
