import java.util.Scanner;
class Program30
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3=sc.nextInt();
int res=(num1+num2*(num3));
System.out.print(num1+"+"+num2+"*"+num3+"="+res);
}
}