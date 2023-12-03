import java.util.Scanner;

public class TaksiMetre {

    public static void main(String[] args) {
        double mesafe,baslangicTutari=10,kmFiyat=2.2,tutar;

        System.out.print("Gidilen Mesafeyi Giriniz: ");

        Scanner input = new Scanner(System.in);

        mesafe = input.nextInt();

        tutar= baslangicTutari+mesafe*kmFiyat;

        System.out.print("Ödenecek Tutar: "+(tutar<20 ? 20 : tutar));

    }
}
