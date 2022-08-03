package ForLoopNest;

public class Oddnumberevennumber
{
    //int i,j;
    public static void main(String[] args)
    {
        int i,j;
        System.out.println("Even numbers" );
        for (i=1;i<=10;i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(+ i);
            }
        }
        System.out.println("odd number");
        for(j=1;j<10;j++)
        {
                  if(j%2==1)
                  {
                   System.out.println(+j);
                  }

        }
    }
}
