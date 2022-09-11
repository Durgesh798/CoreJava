public class Iteration {

    public static void main(String[] args)
    {
        int i,j;
        for (i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for (i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }

        for (i = 1; i <= 4; i++)
        {
            for(j = 1; j <= 4; j++){
                if(i==1 || i==4 || j==1 || j==4) {
                    System.out.print("$" + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
