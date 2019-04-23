import java.util.*;
class Task2
{
	public static void main(String args[])
	{
	int v=0;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Units:");
	int units=input.nextInt();
	if(units<=50)
	{
	v+=units*10;
	System.out.println("Electricity Bill:"+v);
	}
	else if(units>50||units<=100)
	{
	units-=100;
	v+=units*15;
	units=100;
	System.out.println("Electricity Bill:"+v);
	}
	else if(units>101||units<=200)
	{
	units-=200;
	v+=units*20;
	units=200;
	System.out.println("Electricity Bill:"+v);
	}
	else if(units<=300||units>200)
	{
	units-=300;
	v+=units*25;
	units=200;
	System.out.println("Electricity Bill:"+v);
	}
	else if(units>300)
	{
	units-=300;
	v+=units*30;
	units=300;
	System.out.println("Electricity Bill:"+v);
	}
	}
}