import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("enter size of array ");
        int c=sc.nextInt();
        int a[]=new int[c];
        System.out.println("enter array values ");
        for(int i=0;i<c;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<c;j++){
            if(a[j]%2==0){
                sum=sum+a[j];
            }
        }
        System.out.println(sum);
    }
}
