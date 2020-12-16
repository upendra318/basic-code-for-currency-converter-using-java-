//import java.lang.System.exit;
import java.util.Scanner;
class currencyconverter
{

double rupee;
double dollar;
double pound;
double euro;
double yen;
double code;
int chossen=0, u=0;

Scanner nus =new Scanner(System.in);

public void get()
{

System.out.println(" enter currency code 1.rupee\n 2.dollar\n 3.pound\n 4.euro\n 5.yen\n ");

code=nus.nextInt();

if(code==1)

{
System.out.println("enter amount in rupees");

rupee= nus.nextFloat();

System.out.println("In enter a number which country you want to change 1.dollar\n 2.pound\n 3.euro\n 4.yen\n ");

chossen=nus.nextInt();

if(chossen==1)
{
dollar=rupee/69.31;

System.out.println(" dollar: " +dollar);
}

if(chossen==2)
{
pound=rupee/98;

System.out.println(" pound: " +pound);
}

if(chossen==3)
{
euro=rupee/77.74;

System.out.println(" euro: " +euro);
}
if(chossen==4)
{
yen=rupee/0.62;

System.out.println(" yen: " +yen);

}
}

else if(code==2)

{

System.out.println("enter amount in dollar");

dollar = nus.nextFloat();

System.out.println("In enter a number which country you want to change 1.rupee\n 2.pound\n 3.euro\n 4.yen\n ");

chossen=nus.nextInt();

if(chossen==1)
{
rupee=dollar*69.31;

System.out.println(" rupee: " +rupee);
}

if(chossen==2)
{
pound=dollar*0.67;

System.out.println(" pound: " +pound);
}

if(chossen==3)
{
euro=dollar*0.92;

System.out.println(" euro: " +euro);
}

if(chossen==4)
{
yen=dollar*120.90;

System.out.println(" yen: " +yen);

}
}

else if(code==3)

{

System.out.println(" enter amount in pounds");

pound= nus.nextFloat();

System.out.println("In enter a number which country you want to change 1.rupee\n 2.dollar\n 3.euro\n 4.yen\n ");

chossen=nus.nextInt();

if(chossen==1)
{
rupee=pound*98;

System.out.println(" rupee: " +rupee);
}

if(chossen==2)
{

dollar=pound*1.49;

System.out.println(" dollar: " +dollar);
}

if(chossen==3)
{
euro=pound*1.36;

System.out.println(" euro: " +euro);
}

if(chossen==4)
{
yen=pound*179.89;

System.out.println(" yen: " +yen);

}
}

else if(code==4)

{

System.out.println("enter amount in euro");

euro= nus.nextFloat();

System.out.println("In enter a number which country you want to change 1.rupee\n 2.dollar\n 3.pound\n 4.yen\n ");

chossen=nus.nextInt();

if(chossen==1)
{
rupee=euro*72;

System.out.println(" rupee: " +rupee);
}

if(chossen==2)
{
dollar=euro*1.09;

System.out.println(" dollar: " +dollar);
}

if(chossen==3)
{
pound=euro*0.73;

System.out.println(" pound: " +pound);
}

if(chossen==4)
{
yen=euro/0.55;

System.out.println(" yen: " +yen);
}
}

else if(code==5)

{

System.out.println(" enter amount in yens");

yen= nus.nextFloat();

System.out.println("In enter a number which country you want to change 1.rupee\n 2.dollar\n 3.pound\n 4.euro\n ");

euro= nus.nextInt();

if(chossen==1)
{
rupee=yen*0.55;

System.out.println(" reupe: " +rupee);
}

if(chossen==2)
{
dollar=yen/0.01;

System.out.println(" dollar: " +dollar);
}

if(chossen==3)
{
pound=yen/0.01;

System.out.println(" pound: " +pound);
}

if(chossen==4)
{
euro=yen/0.01;

System.out.println(" euro: " +euro);
}
}


else
{

System.out.println("invalid code");
}
}
public void check()
{
System.out.println("if you want to continue :\n1.Yes \n 2.No");

u= nus.nextInt();

if(u==1)

get();


}
};


class currency
{
public static void main(String args[])
{
currencyconverter o= new currencyconverter();
o.get();
o.check();
}
}


