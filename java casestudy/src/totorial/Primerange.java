package totorial;
import java.util.Scanner;
public class Primerange {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int s1,s2,flag=0,i,j;
		System.out.println("Enter the lower limit");
		s1 = s.nextInt();
		System.out.println("Enter the upper limit");
		s2 = s.nextInt();
		System.out.println("Enter the prime number is in between the entered limite are :");
		for(i=s1;i<=s2;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
				else
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				System.out.println(i);
			}
		}
	}
}
				
			
		
		
				
	


