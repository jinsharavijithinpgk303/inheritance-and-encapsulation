package casestudy;
import java.util.Scanner;
public class Casestudy3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Booking5 b=new Booking5();
	b.book();
	}
	}
	class Booking5 {
	static int booked[]=new int[25];
	static void book() {
	Scanner sc=new Scanner(System.in);
	     System.out.println("Registration");
	   System.out.println("Enter your name");
	 String name=sc.nextLine();
	    System.out.println("Enter your address");
	  String  address=sc.nextLine();
	    System.out.println("Contact Number");
	String  contact=sc.nextLine();
	 System.out.println("E-Mail ID");
	 String   email=sc.nextLine();  
	    System.out.println("Enter proof type");
	  String  prooftype=sc.nextLine();  
	    System.out.println("Enter proof id");
	String proofid=sc.nextLine();  
	  Customer cust=new Customer(name,address,contact,email,prooftype,proofid);
	   cust.reg(name,address,contact,email,prooftype,proofid);
	 }
	}

	class Customer

	{ Scanner sc=new Scanner(System.in);
	String pr="";String email1;
	static int booked[]=new int[25];
	    String name;
	       String address;
	       String contact;
	  String email;
	  String prooftype;
	String proofid;
	 Customer(String name,String address,String contact,String email,String prooftype,String proofid)
	 {
	   this.name=name;
	     this.address=address;
	     this.contact=contact;
	     this.email=email;
	   this.prooftype=prooftype;
	    this.proofid= proofid;
	 }
	 void reg(String name,String address,String contact,String email,String prooftype, String proofid )
	 {
	   System.out.println("Customer Details");
	   System.out.println(name);
	   System.out.println(address);
	   System.out.println(contact);
	   System.out.println(email);
	   System.out.println(prooftype);
	   System.out.println(proofid);
	   System.out.println("Thank you for registering. Your id is 1...");
	   System.out.println("Do you want to continue registration?(y/n)");
	   pr = sc.next();
	if (pr.equals("n")==true || pr.equals("y")==true)
	{
	   System.out.println("Do you want to update the email id?(y/n)");
	   String ye=sc.next();
	   if(ye.equals("y")==true) {
	   System.out.println("Update Email");
	   System.out.println("Enter new Email id:");
	email1=sc.next();
	email=email1;
	   System.out.println("Email updated");
	}
	   System.out.println("Your details are as follows");
	   System.out.println("Name  : "+name);
	   System.out.println("Address  : "+address);
	   System.out.println("Contact Number  : "+contact);

	   System.out.println("E-Mail ID  : "+email);
	   System.out.println("Proof type  : "+prooftype);
	   System.out.println("Proof id  : "+proofid);
	}
	   
	   
	   
	 }
	}  


	
	
	
