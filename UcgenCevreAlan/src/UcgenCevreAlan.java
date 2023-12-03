import  java.util.Scanner;

public class UcgenCevreAlan {
    public static void main (String[] args) {

        double kenar1, kenar2, kenar3, u;
        System.out.println("Üçgenin Kenar Uzunluklarını Giriniz ");

        Scanner girdi =new Scanner(System.in);
        System.out.print("1. Kenar: ");
        kenar1 = girdi.nextDouble();
        System.out.print("2. Kenar: ");
        kenar2 = girdi.nextDouble();
        System.out.print("3. Kenar: ");
        kenar3 = girdi.nextDouble();

        u=(kenar1+kenar2+kenar3)/2;

        System.out.print("Çevre: "+2*u+ "\nAlan: " + Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3)));


    }
}
