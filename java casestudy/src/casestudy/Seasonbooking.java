package casestudy;
import java.util.Scanner;
public class Seasonbooking {

	public static void main(String[] args) {
		Booking23 sb = new Booking23();
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number of persons");
	int p=s.nextInt();
	System.out.println("Enter the number of days");
	int da=s.nextInt();
	System.out.println("Enter the room type");
	String r=s.next();
	System.out.println("Enter the tarrif for single person");
	double t=s.nextDouble();
	sb.tariff(p,da,r,t);




	}



	}

	
	

	

