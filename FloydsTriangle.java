import java.util.Scanner;
public class FloydsTriangle
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=s.nextInt();
        int arr[]=new int[size];
        
        print(arr);
    }
    public static void print(int[]a)
    {
int num=1;
for(int i=1;i<=a.length;i++)
{
for(int j=1;j<=i;++j)
{
    
    System.out.print( num+" ");
    num++;
    

    
}
System.out.println(" ");
        
    }
}
}