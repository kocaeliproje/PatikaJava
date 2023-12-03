import  java.util.Scanner;

public class DaireDilimiAlan {

    public static void main(String[] args){

        int r,aci;
        double pi=3.14;

        System.out.print("Dairenin yarı çapını giriniz: ");
        Scanner inp = new Scanner(System.in);
        r= inp.nextInt();
        System.out.print("Daire diliminin açısını giriniz: ");
        Scanner inp2 = new Scanner(System.in);
        aci= inp2.nextInt();

        System.out.print("Dairenin alanı: " + (pi*(r*r)*aci));
    }

}
