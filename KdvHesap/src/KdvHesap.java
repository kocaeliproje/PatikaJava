import  java.util.Scanner;
public class KdvHesap {
    public static void main(String[] args) {

        double kdv = 0, tutar;

        System.out.print("Tutarı giriniz: ");

        Scanner girdi = new Scanner(System.in);

        tutar = girdi.nextDouble();

        if (tutar < 1000 && tutar > 0) {
            kdv = 0.18;
        } else if (tutar > 1000) {
            kdv = 0.08;
        } else {
            System.out.print("Geçerli bir sayı giriniz.");
        }

        System.out.print("Tutar: " + tutar + " KDV Oranı: " + kdv + " KDV Tutarı. " + (tutar * kdv) + " Toplam: " + (tutar + tutar * kdv));
    }
}