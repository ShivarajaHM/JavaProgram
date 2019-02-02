import java.lang.*;
import java.util.*;

class CoinToss{
private enum Coin{Heads, Tails};
Random randomNum=new Random();
private int result;
Coin coinFlip;
public int flip()
{
result=randomNum.nextInt(2);
if(result==0)
{
coinFlip=Coin.Heads;
System.out.println("You Flipped Heads");
return 0;
}
else
{
coinFlip=Coin.Tails;
System.out.println("You Flipped Tails");
return 1;
}

}
}

class FlipCoin{

public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number of times to Flip coin");
int n=scan.nextInt();
CoinToss test=new CoinToss();
int h=0;
int t=0;
for(int i=0;i<n;i++)
{
int res=test.flip();
if(res==0)
{
h+=1;
}
else
{
t+=1;
}
}
System.out.println("Total heads: "+h);
float res1=h/n;
res1*=100;
float res2=t/n;
System.out.println("Total percentage of Heads: "+res1);
System.out.println("Total percentage of Tails: "+res2);
}
}


