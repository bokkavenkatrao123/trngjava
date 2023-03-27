import java.util.Scanner;
class Days
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num==1){System.out.print("MONDAY");}
else if(num==2){System.out.print("TUESDAY");}
else if(num==3){System.out.print("WENSDAY");}
else if(num==4){System.out.print("THURSDAY");}
else if(num==5){System.out.print("FRIDAY");}
else if(num==6){System.out.print("SATURDAY");}
else if(num==7){System.out.print("SUDAY");}
else{System.out.print("INVALID");}
}
}