public class HarmonikOrtalama {

    public static void main(String[] args) {
        int[] liste = {1, 3, 5, 7, 9,11,13};
        System.out.println(Horta(liste));
    }

    public static double Horta(int[] liste)
    {   double hseri= 0.0;
        double horta= 0.0;

        for (int i=0; i< liste.length; i++)
        {
          hseri = hseri+ (double) 1 /liste[i];
            //System.out.println(hseri);
        }
        horta= liste.length /hseri;
        return horta;
    }
}
