
//3x3 matrisin içini rastgele (0-99 arası sayularla) dolduran program
import java.util.*;
public class RastgeleMatris {

    public static void main(String[] args){
        matrisDoldur();
    }
    public static  void matrisDoldur (){
        int matris[][] = new int[3][3];

        Random rand = new Random();

        for (int i=0; i<matris.length;i++){
            for (int j=0; j<matris[i].length; j++){
                matris[i][j] = rand.nextInt(0, 99);
            }
        }
        for (int i=0; i<matris.length;i++){
            System.out.println(" ");
            for (int j=0; j<matris[i].length; j++){
                System.out.print(" "+matris [i][j]);
            }
        }
    }
}
