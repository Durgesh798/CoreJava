public class ArrayEx
{
    public static void main(String[] args)
    {
        int arr[]=new int[5];  //1D Array
        arr[0]=4;
        arr[1]=56;
        arr[2]=42;
        arr[3]=6;
        arr[4]=9;
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("---------------");

        int a[][]={
                {1,2,3,4},
                {5,6,7,8},
                {6,3,2,1}
        }; //2D Array
        for(int f[]: a)
        {
            for(int g:f)
            {
                System.out.print(g+" ");
            }
            System.out.println();
        }
        System.out.println("---------------");
        int c[][]={
                {1,2,3,4,5},
                {5,6,7},
                {6,3,2,1}
        }; //Jagged Array
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[i].length;j++)
            {
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();

        }

    }
}
