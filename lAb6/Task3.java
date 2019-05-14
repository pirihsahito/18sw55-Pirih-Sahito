class Same
{
			int n;
			char c;
			int Show(int n,char c)
			{
			for(int i=0;i<n;i++)
			{
			for(int j=0;j<i;j++){
    
    		System.out.print(c);
    		}
    		System.out.print("\n");}
    		return 0; 
			}
			int Show(char c,int n)
			{

			for(int i=n;i>0;i--)
			{
			for(int j=i;j>0;j--)
    		{
    		System.out.print(c);
    
    		}
    		System.out.print("\n");
    		}
    		return 0;
			}
} 
 class Task3
 {
         public static void main(String args [])
         {
           			Same obj=new Same();
             		System.out.print(obj.Show(5,'*'));
             		System.out.print("\n");
          

         }
 }