import java.util.Scanner;
class leap year
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int year=sc.nextInt();
if(year%2==0)&&if(year%400==0)//if(year%1000==0)
{
System.out.print("it is a leap year");
else
System.out.print("it is not leap year");
}
}
}
