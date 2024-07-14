class SpeedOfVehicle{
public static void main(String[]args){
int a =-50;
if (a<=40)
{
System.out.println("normal speed");
}
else if (a>40 && a<=60){
System.out.println("speed");
}
else if (a>60 && a<=80)
{
System.out.println("high speed");
}
else if(a>80)
{
System.out.println("over speed");
}
}
}