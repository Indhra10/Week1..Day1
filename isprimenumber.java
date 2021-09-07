package week1.day1;



public class isprimenumber {

	

	public static void main(String[] args) {



		

		int input=7,rem=0,quo=0;

		

		 quo=input/2;
        boolean bool=false;
		

		
             for(int i=2;i<=quo;i++)
			
             {
            	rem= input%i;
            	if (rem==0)
            	{
            		bool=true;
            		break;
            	}
            	
            	
            		
             }
             
	
			if (bool==true)
				
			{
				System.out.println("the given number is not a primenumber");
			}
			else
			{
				System.out.println("the given number is  a primenumber");
			}

			

   }

}
