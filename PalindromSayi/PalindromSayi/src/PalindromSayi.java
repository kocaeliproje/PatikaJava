public class PalindromSayi {
    public  static  void main(String[] args)
    {
        System.out.println(isPalindrom(235532) ? "Sayı Palindromdur" : "Sayı Palindrom Değildir.");
    }
    public static boolean isPalindrom (int number)
    {
        int temp=number, lastNumber, riverseNumber=0;

        while (temp!=0)
        {
            System.out.println("*****************");
            System.out.println("Sayı : " + temp);
            lastNumber = temp %10;
            System.out.println("Kalan : " + lastNumber);
            riverseNumber = riverseNumber*10 + lastNumber;
            System.out.println("YeniSayi (ters) : " + riverseNumber);
            temp =temp/10;
        }
        return number == riverseNumber;
    }
}
