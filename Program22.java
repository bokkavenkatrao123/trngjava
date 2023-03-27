import java.util.Scanner;
class Program22
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int i=0;
while(i<5)
{
System.out.println("1:Addition");
System.out.println("2:substraction");
System.out.println("3:multiplication");
System.out.println("4:division");
System.out.println("5:moudulus Division");
int choice=sc.nextInt();
if(choice==1)System.out.println(num1+"+"+num2+"="+(num1+num2));
else if(choice==2)System.out.println(num1+"-"+num2+"="+(num1-num2));
else if(choice==3)System.out.println(num1+"*"+num2+"="+(num1*num2));
else if(choice==4)System.out.println(num1+"/"+num2+"="+(num1-num2));
else if(choice==5)System.out.println(num1+"%"+num2+"="+(num1-num2));
i=i+1;
}
}
}
