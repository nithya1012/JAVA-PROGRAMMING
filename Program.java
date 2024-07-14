import java.util.Scanner;
class Program{
public static void main(String []args)
{
int num1,num2;
Scanner S=new Scanner(System.in);
num1=S.nextInt();
num2=S.nextInt();
if(num1>num2)
{
System.out.println(num1);
}
else{
System.out.println(num2);
}
}
}