import java.util.Scanner;
public class DynamicRead {
    
    public static void main (String[]args)
    {
Scanner s=new Scanner(System.in);
System.out.println("enter an byte");
byte a =s.nextByte();
System.out.println(a);

System.out.println("enter an short");
short b =s.nextShort();
System.out.println(b);

System.out.println("enter an integer");
int c =s.nextInt();
System.out.println(c);

System.out.println("enter an Double value");
double d =s.nextDouble();
System.out.println(d);

System.out.println("enter an Character");
char e =s.next().charAt(3);
System.out.println(e);

System.out.println("enter an Boolean value");
boolean f =s.nextBoolean();
System.out.println(f);
  
    }
}
