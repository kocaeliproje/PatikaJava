public class Fibo {
    public static void main(String[] args)
    {
        int n=8;

        System.out.println(fibaCal(n));
        System.out.println(refibaCal(n));

    }
    public static int fibaCal(int n)
    {   int firstNum=0,temp=0,secontNum=1;

        int i=1;
        while (n>i)
        {
            temp = firstNum+secontNum;
            firstNum = secontNum;
            secontNum = temp;
            i++;
        }
        return secontNum;
    }
    public static int refibaCal(int n) {
        if (n==1 || n==2 ) {
            return 1;
        }
        return  refibaCal(n-1)+ refibaCal(n-2);
    }
}
