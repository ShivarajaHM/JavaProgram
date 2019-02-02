import java.lang.*;
import java.util.*;

class LeapYear{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter year 4 digit number : ");
int year=sc.nextInt();
if((year%400==0)||((year%4==0)&&(year%100!=0)))
{
System.out.println(year+" Is Leap Year");
}
else
{
System.out.println(year+" Is not Leap Year");
}
}
}
