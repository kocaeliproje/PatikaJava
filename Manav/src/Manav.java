import java.util.Scanner;

public class Manav {

    public static void main(String[] args)
    {
        double armut, elma, domates, muz, pat,tutar;
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armut= inp.nextInt();
        System.out.print("Elma Kaç Kilo ? : ");
        elma= inp.nextInt();
        System.out.print("Domates Kaç Kilo ? : ");
        domates= inp.nextInt();
        System.out.print("Muz Kaç Kilo ? : ");
        muz= inp.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        pat= inp.nextInt();

        tutar = armut*2.14 + elma* 3.67 + domates*1.11 + muz*0.95 + pat*5.0;

        System.out.print("Toplam Tutar : "+ tutar);





    }


}
