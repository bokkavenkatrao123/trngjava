import java.util.Scanner;
class leapyear
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int year=sc.nextInt();
if(year%2==0)
{
System.out.print("it is a leap year");
}
if(year%2 !=0)
{
System.out.print("it is not leap year");
}
}
}
