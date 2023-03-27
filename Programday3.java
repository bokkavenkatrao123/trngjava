import java.util.Scanner;
class Programday3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();

System.out.println(("1:Addition"),
("2:substraction"),
("3:multiplication"),
("4:division"),
("5:modulus division"));
int choice=sc.nextInt();
if(choice==1)System.out.println(num1+"+"+num2+"="+(num1+num2));
else if (choice==2)System.out.println(num1+"-"+num2+"="+(num1-num2));
else if (choice==3)System.out.println(num1+"*"+num2+"="+(num1*num2));
else if (choice==4)System.out.println(num1+"/"+num2+"="+(num1/num2));
else if (choice==5)System.out.println(num1+"%"+num2+"="+(num1%num2));
}
}