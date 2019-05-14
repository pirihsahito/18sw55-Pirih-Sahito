class Author
{
			private String name;  //instance variables
			private String email;
			private  char gender;
			Author(String name,String email,char gender)
			{
			this.name=name;
			this.email=email;
			this.gender=gender;

			}
			public String getName()
			{
			return name;
			}
			public String getEmail()
			{
			return email;
			}
			public void setEmail(String email)
			{
			this.email=email;
			}
			public char getGender()
			{
			return gender;
			}
			public void tostring()
			{
				System.out.println("Name="+name+" "+"Email="+email+" "+"Gender ="+gender);
			}
}

class Book
{
			private String name;
			private Author[] authors;
			private double price;
			private int qty=0;
            public Book(String name,Author[] authors,double price,int qty)
            {
            	this.name=name;
            	this.authors=authors;
            	this.price=price;
            	this.qty=qty;

            }
            public String getName()
            {
            	return name;
            }
            public Author[] getAuthors()
            {
            	return authors;
            }
            public double getPrice()
            {
            	return price;
            }
            public void setPrice(double price)
            {
            	this.price=price;
            }
            public int getQty()
            {
            	return qty;
            }
              public void setQty(int qty)
            {
            	this.qty=qty;
            }
 }
class Task2
{
	    public static void main(String args [])
	    {
	    	      Author obj1=new Author("Robert Brown","Robertbrown454@gmail.com",'M');
	    	      Author obj2=new Author("Farhana Mumtaz","Farhanamumtaz854@gmail.com",'F');
	    	      Author [] obj={obj1,obj2};
	    	      Book obj3=new Book("c++ company",obj,890.6,123);
	    	      System.out.println(obj1.getName());
	    	      System.out.println(obj1.getEmail());
	    	      System.out.println(obj1.getGender());
	    	      System.out.println(obj2.getName());
	    	      System.out.println(obj2.getEmail());
	    	      System.out.println(obj2.getGender());
	    	      System.out.println(obj3.getName());
	    	      System.out.println(obj3.getPrice());
	    	      System.out.println(obj3.getQty());
	    } 
}


			






