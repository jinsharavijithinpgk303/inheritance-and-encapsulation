package casestudy;
import java.util.Scanner;
public class Casestudy2 {

	public static void main(String[] args) {
		String str;
		Scanner sc= new Scanner(System.in);
	    Booking1 b = new Booking1();
	    do {
	    System.out.println("menu");
	    System.out.println("1)Book\n2)chechstatus\n3)Exit\n");
	    System.out.println("Enter your choice");
	    int n= sc.nextInt();
	    switch(n)
	    {
	    case 1:
	    	b.book();
	    	break;
	    case 2:
	    	b.checkstatus();
	    	break;
	    }
	    str=sc.next();
	    }while(str.equals("no"));
	    sc.close();
	    }
}
	    
	    
	    
	    
	    
	
