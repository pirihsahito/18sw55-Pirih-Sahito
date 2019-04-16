class Task5
{
	public static void main(String[] args)
	{
	int a=39;
	int b=76;
	int c=16;
	a=c & b;
	System.out.println("a & b:"+c);
	a=c | b;
	System.out.println("a | b:"+c);
	a=c ^ b;
	System.out.println("a ^ b:"+c);
	a=~c;
	System.out.println("~a:"+c);
	a=c << 2;
	System.out.println("a << 2:"+c);
	a=c >> 2;
	System.out.println("a >> b:"+c);
	a=c >>> 2;
	System.out.println("a >>> b:"+c);
	}
}