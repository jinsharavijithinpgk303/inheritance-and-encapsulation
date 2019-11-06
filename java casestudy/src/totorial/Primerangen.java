package totorial;
import java.util.Scanner;
public class Primerangen {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n,i,j,flag=0;
    System.out.println("Enter the limit");
    n = s.nextInt();
    for(i=2;i<=n+1;i++)
    {
    	for(j=2;j<i;j++)
    	{
    		if(i%j==0)
    		{
    			flag = 0;
    			break;
    		}
    		else
    		{
    			flag = 1;
    		}
    	}
    	if(flag==1)
    		System.out.println(i);
    	
    		}
    	}
    }

	


