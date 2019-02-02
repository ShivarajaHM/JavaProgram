import java.lang.*;
import java.util.*;
class PowerOfTwo{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Powero pw=new Powero();
System.out.println("Enter the N value : ");
int n=sc.nextInt();
int a1=2;
int res=pw.powerof(a1,n);

System.out.println("2 Power of "+n+" is: "+res);
}
}
class Powero{
public int powerof(int a1,int n){
int a=1;
for(int i=0;i<n;i++)
{
if(i==0)
{
a=1;
}
else if(i==1)
{
a=2;
}
else
{
a*=a;
}
return a;
}
}
}
