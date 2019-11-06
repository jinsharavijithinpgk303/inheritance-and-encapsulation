package casestudy;
import java.util.Scanner;
public class Hierarchicalinheritance {

	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 Season sb = new Season();
	 Season1 sb1=new Season1();
		System.out.println("Enter the number of persons");
		int p=s.nextInt();
		System.out.println("Enter the number of days");
		int da=s.nextInt();
		System.out.println("Enter the room type");
		String r=s.next();
		System.out.println("Enter the month");
		int mon=s.nextInt();
		if(mon==4||mon==5||mon==6||mon==11||mon==12)
		{
			System.out.println("Enter the peak charge");
			int peak = s.nextInt();
		}
		else
		{
			if(mon==1||mon==2||mon==3||mon==7||mon==8||mon==9||mon==10)
			System.out.println("Enter discount");
			int dis = s.nextInt();
		}
		
		System.out.println("Enter the discount");
		int dis=s.nextInt();
		
		
		
			
			
		
		
		System.out.println("Enter the tarrif for single person");
		double t=s.nextDouble();
		sb.tariff(p,da,mon,peak,t);
		sb1.tariff(p, da, r, mon, dis, t, peak1);
		
		
		}

		}
	 
			 

	}

}
