package casestudy;
import java.util.Scanner;
public class Project2 {
	
	Scanner s=new Scanner(System.in);
	int j=1,i=1,k=1,date1,date2;
	String nss,js;
	String n[]=new String[25];
	int id[]=new int[10];
	int room[]=new int[100];
	String ac,pr;
	String cot;
	String cable;
	String wifi;
	String laundry;

	int total,b,c,d,e,f,sta=0;

	public void regi() {

	// TODO Auto-generated method stub

	do
	{

	System.out.println("\nregistration");
	System.out.println("enter your name");
	n[i]=s.next();
	i++;
	System.out.println("enter your address");
	String adrs=s.next();
	System.out.println("enter your contact no.");
	String con=s.next();
	System.out.println("enter your email");
	String email=s.next();
	System.out.println("enter your proof");
	String proof=s.next();
	System.out.println("enter your proofid");
	String proofid=s.next();
	     id[j]=j;
	System.out.println("Thank you for registering. Your id is "+j);
	j++;
	System.out.println("do u wnt cntnue(ys/no)");
	nss=s.next();
	if(nss.contentEquals("ys"))
	{
	bookss();
	}
	}while(nss.contentEquals("no"));

	}
	private void bookss() {
	// TODO Auto-generated method stub


	System.out.println("Booking");
	System.out.println("Please choose the service required");
	System.out.println("AC/nAC");
	ac=s.next();
	if(ac.equals("AC")==true)
	{
	b=1500;
	}
	else
	{
	b=700;
	}
	System.out.println("cot(single/double)");
	cot=s.next();
	if(cot.equals("single")==true)
	{
	c=50;
	}
	else
	{
	c=100;
	}System.out.println("cable(conn/noconn)");

	cable=s.next();
	if(cable.equals("conn")==true)
	{
	d=50;
	}
	else
	{
	d=0;
	}
	System.out.println("wifi(need/noneed)");

	wifi=s.next();
	if(wifi.equals("need")==true)
	{
	e=200;
	}
	else
	{
	e=0;
	}
	System.out.println("Lundry(need/noneed)");

	laundry=s.next();
	if(laundry.equals("need")==true)
	{
	f=100;
	}
	else
	{
	f=0;
	}
	total =b+c+d+e+f;
	System.out.println("the total charge is Rs."+total);
	System.out.println("the services chosen are");
	if(b==1500)
	{
	System.out.println("ac room");
	}
	else
	{
	System.out.println(" not ac room");
	}
	if(c==50)
	{
	System.out.println("single cot");
	}
	else
	{
	System.out.println("double cot");
	}
	if(d==50)
	{
	System.out.println("cable connection");
	}
	else
	{
	System.out.println(" no cable connection");
	}
	if(e==200)
	{
	System.out.println("wifi");
	}
	else
	{
	System.out.println("wifi");
	}
	if(f==100)
	{
	System.out.println("laundry");
	}
	else
	{
	System.out.println("no laundry");
	}
	System.out.println("do you want to proceed(ys/no)");
	pr=s.next();
	if(pr.equals("no")==true)
	{
	regi();
	}

	if(pr.equals("ys")==true)
	{
	room[k]=1;
	System.out.println("thank you your room number is"+k);
	k=k+1;

	}
	System.out.println("do you want to continue:(ys/no)");
	js=s.next();
	if(js.equals("ys")==true)
	{
	regi();
	}

	if(js.equals("no"))
	{
	view();
	}
	}
	private void view() {
	// TODO Auto-generated method stub
	System.out.println(" starting date");
	date1= s.nextInt();
	System.out.println(" ending date");
	date2= s.nextInt();
	System.out.println("\nthe registration date:"+date1+" to "+date2);
	System.out.println("room number\t\t name:");
	System.out.println("==========================");
	for(int d=1;d<i;d++)
	{
	System.out.println(""+room[d]+"\t\t\t"+n[d]);
	System.out.println();
	}
	System.out.println("============================");
	System.out.println("thank you");
	}




}
