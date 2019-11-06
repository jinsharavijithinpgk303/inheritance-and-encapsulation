package totorial;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the number");
     int n = s.nextInt();
     int i,count=0;
     for(i=2;i<n/2;i++)
     {
    	 
    	 if(n%i==0)
    	 {
    		 count++;
    		 break;
    	 }
    	 }
     
     if(count==0)
     {
    	 System.out.println("Prime number");
     }
     else
     {
    	 System.out.println("Not a prime number");
     }
	}
}

     
    			 
    			 
	
	


