import java.util.Scanner;

public class VicutKitle {

public static void main(String[]args){

    float kilo=0,boy=0;
    Scanner imp = new Scanner(System.in);

    System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
    boy = imp.nextFloat();

    System.out.print("Lütfen kilonuzu giriniz : ");
    kilo = imp.nextFloat();

    System.out.print("Vücut Kitle İndeksiniz : "+ (kilo/(boy*boy)));
  }
 }