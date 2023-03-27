import java.util.Scanner;
class lucky2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int res=0;
if(num2==0)System.out.print("INVALID");
else {
res=num1/num2;
System.out.println(num1+"/"+num2+"="+res);
}
}
}