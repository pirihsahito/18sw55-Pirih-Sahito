import java.util.*;
class Task4
{
	public static void main(String args[])
	{
	int x,y;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter 1st number:");
	x=input.nextInt();
	System.out.println("Enter 2nd number:");
	y=input.nextInt();
	System.out.println("Enter Operand + or - or / or *:");
	char op=input.next().charAt(0);
	switch(op)
	{
	case '+':
	System.out.println(x+y);
	break;
	case '-':
	System.out.println(x-y);
	break;
	case '*':
	System.out.println(x*y);
	break;
	case '/':
	System.out.println(x/y);
	break;
	default:
	System.out.println("Error");
	}
	}
}