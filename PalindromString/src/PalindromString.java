public class PalindromString {

    public  static void main(String[] args)
    {
        String s= "1aaabaaa1";
        System.out.println(isPalindrom (s));
    }
    public static boolean isPalindrom(String s)
    {
        for (int i=0; i<s.length();i++)
        {
            if (s.charAt(i) != s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }
}
