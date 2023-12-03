import java.util.Scanner;

public class GectiKaldi {

   public static void main(String[] args) {

       int mat, fizik, kimya, ort;
       boolean son;

       Scanner input = new Scanner(System.in);

    System.out.print("Mat notunu giriniz: ");
    mat=input.nextInt();

    System.out.print("Fizik notunu giriniz: ");
    fizik=input.nextInt();

    System.out.print("Kimya notunu giriniz: ");
    kimya=input.nextInt();

    ort= (mat+fizik+kimya)/3;

    System.out.print(ort<60 ? "Kaldı": "Geçti");

    }
}
