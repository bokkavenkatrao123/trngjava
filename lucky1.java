import java.util.scanner;
class lucky1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i=num;
while(i>=0)
{
System.out.print(i+",");
i=i-1;
}
}
}