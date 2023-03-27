import java.util.Scanner;
class Years
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char year=sc.nextchar();
if(year%2==0)
{
System.out.print("leap");
}
if(year%2 !=0)
{
System.out.print("non leap");
}
}
}