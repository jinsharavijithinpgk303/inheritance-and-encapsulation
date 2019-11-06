package casestudy;
import java.util.Scanner;
 
		class sea  {
			void tot(int n,int d,int th,int dis,int peak) {
			int j=((n*d*th)+peak-dis);
			System.out.println("Hotel tariff "+j+" Rupees");
			}
			}
			class tota extends sea{

			}
			class Avg extends sea{

			}
			public class Season11 {
			public static void main(String[] args) {
			System.out.println("Booking\n No.of persons");
			Scanner s=new Scanner (System.in);
			int n=s.nextInt();
			System.out.println("No.of days");
			int d=s.nextInt();
			System.out.println("Room type");
			String r=s.next();
			System.out.println("Month");
			int m=s.nextInt();
			switch(m)
			{
			case 1:
			case 2:
			case 3:
			case 7:
			case 9:
			case 8:
			case 10:
			System.out.println("Discount");
			int dis=s.nextInt();
			break;
			case 4:
			case 5:
			case 6:
			case 11:
			case 12:
			System.out.println("Peak charge");
			int peak=s.nextInt();
			default: System.out.println("invalid month");
			}
			System.out.println("Tariff per person");
			int th=s.nextInt();

			Avg st=new Avg();
			int dis = 0;
			int peak = 0;
			st.tot(n,d,th,dis,peak);
			

			
	}

}
