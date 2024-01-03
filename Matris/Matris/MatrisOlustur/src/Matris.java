//Kullanıcıdan Matris bilgilerini alıp ekrana yazdıran program

import java.util.Scanner;

public class Matris {

    public static  void  main (String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Matris X boyutunu giriniz: ");
        int boyutX = inp.nextInt();
        System.out.print("Matris Y boyutunu giriniz: ");
        int boyutY = inp.nextInt();
        System.out.print(boyutX + " x " + boyutY + " Boyutlu Matrisin elemanlarını giriniz: ");

        int matris[][] = new int[boyutX][boyutY];

        for (int i = 0; i < matris.length; i++) {

            for (int j = 0; j < matris[i].length; j++) {

                matris[i][j] = inp.nextInt();

            }
        }

        for (int i = 0; i < matris.length; i++) {

            System.out.println(" ");
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j]);

            }
        }
    }

}
