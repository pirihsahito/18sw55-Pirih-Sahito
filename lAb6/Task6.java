class UseOfStatic
{
	  
	  		static String name;
	  		static int age;
	  		static String Adress;
	  		static void Method(String name,int age,String adress)
	  		{
	  		 System.out.println("MY NAME IS :" +name);
	  		 System.out.println("MY AGE IS :" +age);
	  		 System.out.println("MY Adress IS :" +Adress);

	  		 }
	  		static
	  		{
	  		System.out.println("WRITE BELOW YOUR BIO-DATA :");
	  		}
}
class Task6
{
	      public static void main(String args [])
	      {
	      			UseOfStatic.Method("Farhana",19,"Elsa Kazi Hostel");
	      }
}