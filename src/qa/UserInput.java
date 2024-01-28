package qa;

import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter number :");
        Scanner sn=new Scanner(System.in);
        n=sn.nextInt();
        System.out.println(n);
    }
}
