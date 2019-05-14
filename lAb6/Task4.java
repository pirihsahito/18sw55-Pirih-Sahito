class Area
{
	    		 int Method(int s)
	     		 {
	      		 int area=s*s;
	      		 return area;
	     		 }
	     		 int Method(int length,int width)
	             {
	             int area=length*width;
	             return area;
	             }
}

class Task4
{
	    public static void main(String [] args)
	    {
	                Area obj=new Area();
	                Area obj1=new Area();
	                System.out.println("The Area Of Square Is "+obj.Method(5));
	                System.out.print("The Area Of Rectangle Is " +obj1.Method(5,4));
	    }
}